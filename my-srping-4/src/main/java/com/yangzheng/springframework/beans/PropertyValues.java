package com.yangzheng.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 01514:12
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue py){
        this.propertyValueList.add(py);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue py : this.propertyValueList){
            if (py.getName().equals(propertyName)) {
                return py;
            }
        }
        return null;
    }
}
