package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author fuguangwei
 * @date 2022-08-11
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
