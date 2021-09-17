package com.yangzheng.springframework.beans.factory.config;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/14 01415:46
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
