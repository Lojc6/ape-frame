package com.lojc.config;

import com.lojc.inteceptor.SqlBeautyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *@Auther Lojc
 *@Date 2023/9/6
 */
@Configuration
public class MybatisConfiguration {

    @Bean
    public SqlBeautyInterceptor sqlBeautyInterceptor(){
        return  new SqlBeautyInterceptor();
    }


}
