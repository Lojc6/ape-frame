package com.Lojc.controller;

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
    @GetMapping("/haha")
    public String hello(){
        return  "<h1>Hello,motherFucker<h1>";
    }
}
