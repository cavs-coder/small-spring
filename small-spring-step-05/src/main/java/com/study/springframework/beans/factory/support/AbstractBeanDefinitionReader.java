package com.study.springframework.beans.factory.support;

import com.study.springframework.beans.BeansException;
import com.study.springframework.core.io.DefaultResourceLoader;
import com.study.springframework.core.io.Resource;
import com.study.springframework.core.io.ResourceLoader;

/**
 * @author fuguangwei
 * @date 2023-07-28
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
