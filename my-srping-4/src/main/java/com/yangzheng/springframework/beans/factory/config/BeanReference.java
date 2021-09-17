package com.yangzheng.springframework.beans.factory.config;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 01514:36
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
