package com.yangzheng.springframework.beans.factory;

import com.yangzheng.springframework.beans.BeansException;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 0158:31
 */
public interface BeansFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;
}
