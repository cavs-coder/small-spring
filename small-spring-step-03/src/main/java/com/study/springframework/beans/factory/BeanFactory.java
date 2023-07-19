package com.study.springframework.beans.factory;

import com.study.springframework.beans.BeansException;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
