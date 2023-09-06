package com.lojc.user;

/*
 *@Auther Lojc
 *@Date 2023/9/3
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.lojc")
@MapperScan(value = "com.lojc.*.mapper")
@ComponentScan(value = "com.lojc")

public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
