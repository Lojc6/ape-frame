package com.lojc.user.service;

import com.lojc.entity.PageResult;
import com.lojc.user.entity.dto.UserDto;
import com.lojc.user.entity.po.UserPo;

public interface UserService {
    int addUser(UserDto userDto);

    int delete(Integer id);

    PageResult<UserPo> getUserPage(UserDto userDto);
}
