package com.yangzheng.springframework.beans.factory.config;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 01514:39
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
