package com.yangzheng.springframework.beans.factory.support;

import com.yangzheng.springframework.beans.BeansException;
import com.yangzheng.springframework.beans.factory.BeansFactory;
import com.yangzheng.springframework.beans.factory.config.BeanDefinition;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 0159:41
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeansFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name,null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name,args);
    }

    protected <T> T doGetBean(final String name, final Object[] args){
        Object bean = getSingleton(name);
        if (bean != null){
            return (T)bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T)createBean(name,beanDefinition,args) ;
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String name,BeanDefinition beanDefinition,Object[] args) throws BeansException;
}
