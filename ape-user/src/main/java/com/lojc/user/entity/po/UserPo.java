package com.lojc.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.Value;

import java.util.Date;

/*
 *@Auther Lojc
 *@Date 2023/9/5
 */
@TableName("user")
@Data
public class UserPo {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "age")
    private Integer age;

    @TableField(value = "create_by", fill = FieldFill.INSERT)
    private String createBy;

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    private String updateBy;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;

    @TableField(value = "delete_flag", fill = FieldFill.INSERT_UPDATE)
    private Integer deleteFlag;

    @TableField(value = "version", fill = FieldFill.INSERT_UPDATE)
    private Integer version;

}
