package com.lojc.redis.init;

import com.lojc.redis.utils.SpringContextUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import sun.tools.jar.CommandLine;

import java.util.Map;

/*
 *@Auther Lojc
 *@Date 2023/9/8
 */
@Component
@ConditionalOnProperty(name = {"init.cache.init"},havingValue = "true")
public class InitCache implements CommandLineRunner {

    /*
    *项目启动时候会直接运行run中的内容
    */
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext applicationContext= SpringContextUtil.getApplicationContext();
        Map<String,AbstractCache> beanMap=applicationContext.getBeansOfType(AbstractCache.class);
        //调用init方法
        if (!beanMap.isEmpty()){
            for (Map.Entry<String, AbstractCache> entry : beanMap.entrySet()) {
                AbstractCache abstractCache=(AbstractCache) SpringContextUtil.getBean(entry.getValue().getClass());
                abstractCache.initCache();
            }
        }
        System.out.println("缓冲预热成功.....");
    }


}
