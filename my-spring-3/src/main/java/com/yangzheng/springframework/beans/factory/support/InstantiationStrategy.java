package com.yangzheng.springframework.beans.factory.support;

import com.yangzheng.springframework.beans.BeansException;
import com.yangzheng.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 01510:20
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
