package org.springframework;

/**
 * @author fuguangwei
 * @date 2022-08-10
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
