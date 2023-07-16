package com.study.springframework;

/**
 * @author fuguangwei
 * @date 2023-07-16
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
