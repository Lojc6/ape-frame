package com.lojc.redis.utils;

import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/*
 *@Auther Lojc
 *@Date 2023/9/8
 * @Description: 当一个类实现了ApplicationContextAware接口之后，这个类就可以方便的获得ApplicationContext对象（Spring上下文），
 * Spring发现某个Bean实现了ApplicationContextAware接口，Spring容器会在创建该Bean之后，自动调用该Bean的setApplicationContext（参数）方法，
 * 调用该方法时，会将容器本身ApplicationContext对象作为参数传递给该方法。
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationCtxt;

    public static ApplicationContext getApplicationContext(){
        return  applicationCtxt;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationCtxt=applicationContext;
    }

    public static Object getBean(Class type){
        return applicationCtxt.getBean(type);
    }

}
