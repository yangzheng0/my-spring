package com.yangzheng.springframework.beans.factory.support;

import com.yangzheng.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 0158:36
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String,Object> singletonMap = new HashMap<String, Object>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonMap.get(beanName);
    }

    public void addSingleton(String beanName,Object singletonObject){
        singletonMap.put(beanName,singletonObject);
    }
}
