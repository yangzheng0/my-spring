package com.yangzheng.springframework.beans;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/14 01415:56
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg,cause);
    }
}
