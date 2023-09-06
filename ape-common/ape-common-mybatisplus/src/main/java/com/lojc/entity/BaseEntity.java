package com.lojc.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/*
 *@Auther Lojc
 *@Date 2023/9/6
 */



/*
* 就是数据库规范,把公共字段抽取出来。在做业务的时候,创建出来的实例类要继承这个公共
* 的字段类。
* */
@Data
public class BaseEntity  implements Serializable{

    @TableField(value = "create_by", fill = FieldFill.INSERT)
    private String createBy;

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    private String updateBy;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;

    @TableField(value = "delete_flag", fill = FieldFill.INSERT)
    private Integer deleteFlag;

    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

}
