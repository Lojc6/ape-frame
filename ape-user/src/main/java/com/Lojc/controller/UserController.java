package com.Lojc.controller;

import com.Lojc.entity.dto.UserDto;
import com.Lojc.entity.req.UserReq;
import com.Lojc.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 *@Auther Lojc
 *@Date 2023/9/3
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/testInsert")
    public Integer addUser(@RequestBody UserReq userReq){

        UserDto userDto=new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        int i = userService.addUser(userDto);

        return  i;
    }
}
