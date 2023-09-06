package com.lojc.user.service.impl;

import com.lojc.user.entity.dto.UserDto;
import com.lojc.user.entity.po.UserPo;
import com.lojc.user.mapper.UserMapper;
import com.lojc.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@Auther Lojc
 *@Date 2023/9/5
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(UserDto userDto) {

        UserPo userPo=new UserPo();
        BeanUtils.copyProperties(userDto,userPo);//效率不高

        int insert = userMapper.insert(userPo);

        return insert;
    }
}
