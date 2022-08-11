package org.springframework.beans.factory.config;

/**
 * @author fuguangwei
 * @date 2022-08-11
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
