package com.yangzheng.springframework.beans.factory.config;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 0158:32
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
