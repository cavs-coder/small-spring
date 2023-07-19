package com.study.springframework.beans.support;

import com.study.springframework.beans.config.BeanDefinition;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
