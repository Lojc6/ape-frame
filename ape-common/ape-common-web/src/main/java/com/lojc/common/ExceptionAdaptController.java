package com.lojc.common;

import com.lojc.bean.Result;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 *@Auther Lojc
 *@Date 2023/9/6
 */
@RestControllerAdvice        //提供了一个切面方法,在发生异常时的处理
public class ExceptionAdaptController {

    @ExceptionHandler(RuntimeException.class)
    public Result runTimeException(RuntimeException exception){
        exception.printStackTrace();
        return Result.Error();
    }

//    @ExceptionHandler(Exception.class)
    public Result exception(Exception exception){
        exception.printStackTrace();
        return Result.Error();
    }

}
