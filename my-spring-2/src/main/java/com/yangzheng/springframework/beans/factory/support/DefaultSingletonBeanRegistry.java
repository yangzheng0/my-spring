package com.yangzheng.springframework.beans.factory.support;

import com.yangzheng.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/14 01415:48
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String,Object> stringObjectMaps = new HashMap<String, Object>();

    @Override
    public Object getSingleton(String beanName) {
        return stringObjectMaps.get(beanName);
    }

    public void addSingleton(String beanName,Object singletonObject){
        stringObjectMaps.put(beanName,singletonObject);
    }
}
