package com.study.springframework.beans.factory.config;

/**
 * @author fuguangwei
 * @date 2023-07-19
 */
public class BeanReference {

    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
