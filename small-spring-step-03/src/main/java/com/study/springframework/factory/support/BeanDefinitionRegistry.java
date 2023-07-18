package com.study.springframework.factory.support;

import com.study.springframework.factory.config.BeanDefinition;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
