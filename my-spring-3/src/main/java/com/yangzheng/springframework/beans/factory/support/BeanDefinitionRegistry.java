package com.yangzheng.springframework.beans.factory.support;

import com.yangzheng.springframework.beans.factory.config.BeanDefinition;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 01510:54
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
