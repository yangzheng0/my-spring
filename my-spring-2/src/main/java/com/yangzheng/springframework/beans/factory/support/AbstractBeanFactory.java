package com.yangzheng.springframework.beans.factory.support;

import com.yangzheng.springframework.beans.BeansException;
import com.yangzheng.springframework.beans.factory.BeanFactory;
import com.yangzheng.springframework.beans.factory.config.BeanDefinition;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/14 01416:01
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws Exception {
        Object bean = getSingleton(beanName);
        if (bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;
}
