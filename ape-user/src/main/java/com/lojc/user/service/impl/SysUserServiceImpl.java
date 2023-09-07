package com.lojc.user.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lojc.bean.PageResponse;
import com.lojc.user.convert.SysUserConverter;
import com.lojc.user.entity.po.SysUser;
import com.lojc.user.dao.SysUserDao;
import com.lojc.user.entity.req.SysUserReq;
import com.lojc.user.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2023-09-07 14:48:04
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {



    @Autowired
    private SysUserDao sysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(Long id) {
        return this.sysUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public PageResponse<SysUser> queryByPage(SysUserReq sysUserReq) {

//        SysUser sysUser=new SysUser();
//        BeanUtils.copyProperties(sysUserReq,sysUser)    更换为以下mapstruct的方式
        SysUser sysUser = SysUserConverter.INSTANCE.convertReqToSysUser(sysUserReq);

        PageResponse<SysUser> pageResponse=new PageResponse<>();
        pageResponse.setCurrent(sysUserReq.getPageNo());
        pageResponse.setPageSize(sysUserReq.getPageSize());
        Long pageStart=(sysUserReq.getPageNo()-1)*sysUserReq.getPageSize();
        Long total=this.sysUserDao.count(sysUser);
        System.out.println(total);
        List<SysUser> sysUserList = this.sysUserDao.queryAllByLimit(sysUser, pageStart, sysUserReq.getPageSize());
        System.out.println(sysUserList);
        pageResponse.setTotal(total);
        pageResponse.setRecords(sysUserList);
        return pageResponse;
    }

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUserDao.insert(sysUser);
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser sysUser) {
        this.sysUserDao.update(sysUser);
        return this.queryById(sysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysUserDao.deleteById(id) > 0;
    }
}
