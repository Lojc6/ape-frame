package com.lojc.user.Cache;

import com.lojc.redis.init.AbstractCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/*
 *@Auther Lojc
 *@Date 2023/9/8
 */
@Component
public class SysUserCache extends AbstractCache {

    private static final String SYS_USER_CACHE_KEY="SYS_USER";

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public void initCache() {
        /*
        ?与数据库做联动,或者其它数据源做联动,在启动时直接加载进redis
        */
        redisTemplate.opsForValue().set(SYS_USER_CACHE_KEY,"balalalalal");
    }

    @Override
    public <T> T getCache() {
        if (!redisTemplate.hasKey(SYS_USER_CACHE_KEY).booleanValue()){
            reloadCache();
        }
        return (T)redisTemplate.opsForValue().get(SYS_USER_CACHE_KEY);
    }

    @Override
    public void clearCache() {
      redisTemplate.delete(SYS_USER_CACHE_KEY);
    }

}
