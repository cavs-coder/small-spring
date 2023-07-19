package com.study.springframework.beans.factory.support;

import com.study.springframework.beans.BeansException;
import com.study.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * jdk
 * @author fuguangwei
 * @date 2023-07-18
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            if (ctor != null) {
                return beanClass.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }
            return beanClass.getDeclaredConstructor().newInstance();

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException |
                 InstantiationException e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
