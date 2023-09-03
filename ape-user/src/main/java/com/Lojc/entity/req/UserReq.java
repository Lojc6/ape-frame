package com.Lojc.entity.req;

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
public class UserReq {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Integer deleteFlag;

    private Integer version;

}
