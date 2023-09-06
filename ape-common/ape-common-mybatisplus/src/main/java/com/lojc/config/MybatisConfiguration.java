package com.lojc.config;

import com.lojc.inteceptor.SqlBeautyInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *@Auther Lojc
 *@Date 2023/9/6
 */
@Configuration
public class MybatisConfiguration {

    @Bean
    //只有在application.yml里面有对应的属性的时候,才会加载这个bean          详细可以去查macthIfMissing
    @ConditionalOnProperty(name = {"sql.beauty.show"},havingValue = "true",matchIfMissing = true)
    public SqlBeautyInterceptor sqlBeautyInterceptor(){
        return  new SqlBeautyInterceptor();
    }


}
