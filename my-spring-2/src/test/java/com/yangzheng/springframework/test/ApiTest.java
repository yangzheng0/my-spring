package com.yangzheng.springframework.test;

import com.yangzheng.springframework.beans.factory.config.BeanDefinition;
import com.yangzheng.springframework.beans.factory.support.BeanDefinitionRegistry;
import com.yangzheng.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.yangzheng.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/14 01416:52
 */
public class ApiTest {

    @Test
    public void test() throws Exception {
        System.out.println("测试");

        // 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        // 3.第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取bean from Singleton
        UserService userServiceSingleton = (UserService) beanFactory.getBean("userService");
        userServiceSingleton.queryUserInfo();
    }
}
