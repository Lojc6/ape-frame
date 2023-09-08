package com.lojc.user.controller;

import com.lojc.redis.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *@Auther Lojc
 *@Date 2023/9/3
 */
@RestController
@RequestMapping("/hello")
public class helloController {
    @Autowired
    private RedisUtil redisUtil;
    @GetMapping("/haha")
    public String hello(){
        return  "<h1>Hello,motherFucker<h1>";
    }

    @GetMapping("/TestRedis")
    public void TestRedis(){
        redisUtil.set("LB","傻逼");
    }
}
