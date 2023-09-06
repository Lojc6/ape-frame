package com.lojc.bean;

import lombok.Data;

import java.io.Serializable;

/*
 *@Auther Lojc
 *@Date 2023/9/6
 */
@Data
public class Result<T> implements Serializable {

    private Result(){}  //设置私有,不允许实例化
    private Boolean success;

    private Integer code;

    private String message;

    private T data;


    public static Result OK(){
       Result result=new Result();
       result.setSuccess(true);
       result.setCode(ResultCode.SUCCESS);
       result.setMessage(ResultMessage.SUCCESS);
       return result;
    }

    public static Result OK(Integer resultCode,String resultMessage){
        Result result=new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(resultMessage);
        return result;
    }

    public static<T> Result OK(Integer resultCode,String resultMessage,T data){
        Result result=new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(resultMessage);
        result.setData(data);
        return result;
    }

    public static<T> Result OK(T data){
        Result result=new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(ResultMessage.SUCCESS);
        result.setData(data);
        return result;
    }

    public static Result Error(){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.ERROR);
        result.setMessage(ResultMessage.ERROR);
        return result;
    }

    public static Result Error(Integer resultCode,String resultMessage){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(resultCode);
        result.setMessage(resultMessage);
        return result;
    }

    public static<T> Result Error(Integer resultCode,String resultMessage,T data){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(resultCode);
        result.setMessage(resultMessage);
        result.setData(data);
        return result;
    }

    public static<T> Result Error(T data){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.ERROR);
        result.setMessage(ResultMessage.ERROR);
        result.setData(data);
        return result;
    }




}
