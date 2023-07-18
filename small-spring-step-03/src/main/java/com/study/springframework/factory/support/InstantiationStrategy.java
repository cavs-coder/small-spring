package com.study.springframework.factory.support;

import com.study.springframework.BeansException;
import com.study.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author fuguangwei
 * @date 2023-07-18
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
