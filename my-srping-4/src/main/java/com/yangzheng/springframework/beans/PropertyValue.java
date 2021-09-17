package com.yangzheng.springframework.beans;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 01514:10
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name,Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
