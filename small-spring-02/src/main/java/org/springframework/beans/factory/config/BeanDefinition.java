package org.springframework.beans.factory.config;

/**
 * @author fuguangwei
 * @date 2022-08-11
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }
}
