package com.yangzheng.springframework.beans.factory;

import com.yangzheng.springframework.beans.BeansException;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 01514:07
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;
}
