package com.study.springframework.factory;

import com.study.springframework.BeansException;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
