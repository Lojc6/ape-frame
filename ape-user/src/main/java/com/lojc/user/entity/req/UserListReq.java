package com.lojc.user.entity.req;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/*
 *@Auther Lojc
 *@Date 2023/9/5
 */
@TableName("user")
@Data
public class UserListReq {

    private Integer pageIndex;

    private Integer pageSize;


}
