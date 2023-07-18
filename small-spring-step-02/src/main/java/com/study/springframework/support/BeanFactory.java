package com.study.springframework.support;

import com.study.springframework.BeansException;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
