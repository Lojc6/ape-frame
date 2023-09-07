package com.lojc.user.entity.dto;

import lombok.Data;

/*
 *@Auther Lojc
 *@Date 2023/9/5
 */
@Data
public class UserDto {

    private String name;

    private Integer age;

    private Integer pageIndex;

    private Integer pageSize;


}
