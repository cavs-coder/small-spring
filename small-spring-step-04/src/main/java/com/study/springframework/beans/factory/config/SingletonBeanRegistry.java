package com.study.springframework.beans.factory.config;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
