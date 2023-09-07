package com.lojc.user.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lojc.user.entity.po.UserPo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper extends BaseMapper<UserPo> {

    IPage<UserPo> getUserpage(IPage<UserPo> userPoIPage);

}
