package com.study.springframework.beans.factory.support;

import com.study.springframework.beans.BeansException;
import com.study.springframework.core.io.Resource;
import com.study.springframework.core.io.ResourceLoader;

/**
 * @author fuguangwei
 * @date 2023-07-28
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
