package com.study.springframework.support;

import com.study.springframework.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    public void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
