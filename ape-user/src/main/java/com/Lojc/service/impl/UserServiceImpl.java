package com.Lojc.service.impl;

import com.Lojc.entity.dto.UserDto;
import com.Lojc.entity.po.UserPo;
import com.Lojc.mapper.UserMapper;
import com.Lojc.service.UserService;
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
