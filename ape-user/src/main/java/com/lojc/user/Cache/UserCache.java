package com.lojc.user.Cache;

import com.lojc.redis.init.AbstractCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/*
 *@Auther Lojc
 *@Date 2023/9/8
 */
@Component
public class UserCache extends AbstractCache {

    private static final String USER_CACHE_KEY="USER";

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void initCache() {
        redisTemplate.opsForValue().set(USER_CACHE_KEY,"Lojc2");
    }

    @Override
    public <T> T getCache() {
        if (!redisTemplate.hasKey(USER_CACHE_KEY).booleanValue()){
            reloadCache();
        }
        return (T)redisTemplate.opsForValue().get(USER_CACHE_KEY);
    }

    @Override
    public void clearCache() {
        redisTemplate.delete(USER_CACHE_KEY);
    }
}
