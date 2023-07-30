package com.study.springframework.beans.factory.support;

import com.study.springframework.beans.factory.config.BeanDefinition;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

}
