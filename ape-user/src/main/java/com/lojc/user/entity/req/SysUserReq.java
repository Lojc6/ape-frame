package com.lojc.user.entity.req;

import com.lojc.bean.PageRequest;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2023-09-07 14:48:03
 */
@Data
public class SysUserReq extends PageRequest implements Serializable {
    private static final long serialVersionUID = -10344142399716186L;

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

