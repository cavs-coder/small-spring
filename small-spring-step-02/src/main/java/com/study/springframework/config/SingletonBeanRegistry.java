package com.study.springframework.config;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
