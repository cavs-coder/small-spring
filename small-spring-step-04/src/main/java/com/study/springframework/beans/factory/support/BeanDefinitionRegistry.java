package com.study.springframework.beans.factory.support;

import com.study.springframework.beans.factory.config.BeanDefinition;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
