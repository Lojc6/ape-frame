package com.lojc.redis.init;

import com.lojc.redis.utils.SpringContextUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

/*
 *@Auther Lojc
 *@Date 2023/9/8
 */
@Component
@ConditionalOnProperty(name = {"init.cache.reload"},havingValue = "true")
public class ReloadCache implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext applicationContext= SpringContextUtil.getApplicationContext();
        Map<String,AbstractCache> beanMap=applicationContext.getBeansOfType(AbstractCache.class);
        //调用init方法
        if (!beanMap.isEmpty()){
            for (Map.Entry<String, AbstractCache> entry : beanMap.entrySet()) {
                AbstractCache abstractCache=(AbstractCache) SpringContextUtil.getBean(entry.getValue().getClass());
                abstractCache.reloadCache();
            }
        }
        System.out.println("缓冲重加载成功.....");
    }
}
