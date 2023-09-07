package com.lojc.user.convert;

import com.lojc.user.entity.po.SysUser;
import com.lojc.user.entity.req.SysUserReq;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper  //别引错了,是mapstruct的Mapper注解
public interface SysUserConverter {

    SysUserConverter INSTANCE= Mappers.getMapper(SysUserConverter.class);

    @Mapping(source = "age",target = "age")//举例：当属性名不一样的时候可以这么设置
    SysUser convertReqToSysUser(SysUserReq sysUserReq);

}
