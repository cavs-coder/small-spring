package com.study.springframework.beans.factory.support;

import com.study.springframework.beans.BeansException;
import com.study.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author fuguangwei
 * @date 2023-07-18
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
