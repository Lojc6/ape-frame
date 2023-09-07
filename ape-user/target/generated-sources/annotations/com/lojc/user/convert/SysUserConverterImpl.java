package com.lojc.user.convert;

import com.lojc.user.entity.po.SysUser;
import com.lojc.user.entity.req.SysUserReq;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-08T01:30:24+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
public class SysUserConverterImpl implements SysUserConverter {

    @Override
    public SysUser convertReqToSysUser(SysUserReq sysUserReq) {
        if ( sysUserReq == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setName( sysUserReq.getName() );
        sysUser.setId( sysUserReq.getId() );
        sysUser.setAge( sysUserReq.getAge() );
        sysUser.setCreateBy( sysUserReq.getCreateBy() );
        sysUser.setCreateTime( sysUserReq.getCreateTime() );
        sysUser.setUpdateBy( sysUserReq.getUpdateBy() );
        sysUser.setUpdateTime( sysUserReq.getUpdateTime() );
        sysUser.setDeleteFlag( sysUserReq.getDeleteFlag() );
        sysUser.setVersion( sysUserReq.getVersion() );

        return sysUser;
    }
}
