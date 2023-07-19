package com.study.springframework.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fuguangwei
 * @date 2023-07-16
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
