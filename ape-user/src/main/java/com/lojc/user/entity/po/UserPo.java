package com.lojc.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import com.lojc.entity.BaseEntity;
import lombok.Data;
import lombok.Value;

import java.util.Date;

/*
 *@Auther Lojc
 *@Date 2023/9/5
 */
@TableName("user")
@Data
public class UserPo  extends BaseEntity {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "age")
    private Integer age;

    //下面的这些公共字段全部转到BaseEntity下了

//    @TableField(value = "create_by", fill = FieldFill.INSERT)
//    private String createBy;
//
//    @TableField(value = "create_time",fill = FieldFill.INSERT)
//    private Date createTime;
//
//    @TableField(value = "update_by", fill = FieldFill.UPDATE)
//    private String updateBy;
//
//    @TableField(value = "update_time", fill = FieldFill.UPDATE)
//    private Date updateTime;
//
//    @TableField(value = "delete_flag", fill = FieldFill.INSERT)
//    private Integer deleteFlag;
//
//    @TableField(value = "version", fill = FieldFill.INSERT)
//    private Integer version;

}
