package com.lojc.user.controller;

import com.lojc.bean.Result;
import com.lojc.user.entity.dto.UserDto;
import com.lojc.user.entity.req.UserReq;
import com.lojc.user.service.UserService;
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
    public Result addUser(@RequestBody UserReq userReq){

        UserDto userDto=new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        int i=1/0;
        return Result.OK(userService.addUser(userDto));
    }
}
