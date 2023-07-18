package com.study.springframework.factory.config;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
