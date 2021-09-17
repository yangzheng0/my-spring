package com.yangzheng.springframework.beans.factory;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/14 01415:53
 */
public interface BeanFactory {

    Object getBean(String beanName) throws Exception;
}
