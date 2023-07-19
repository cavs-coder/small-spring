package com.study.springframework.beans.support;

import com.study.springframework.beans.BeansException;
import com.study.springframework.beans.config.BeanDefinition;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
