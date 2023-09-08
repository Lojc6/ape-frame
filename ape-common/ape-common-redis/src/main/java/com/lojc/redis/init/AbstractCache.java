package com.lojc.redis.init;

import org.springframework.stereotype.Component;

/*
 *@Auther Lojc
 *@Date 2023/9/8
 * @Description: redis预热缓存
 */
@Component
public abstract class AbstractCache {

    public abstract void initCache();

    public abstract <T> T getCache();

    public abstract void clearCache();

    public void reloadCache(){
        clearCache();
        initCache();
    }

}
