package com.study.springframework.beans.factory.support;

import com.study.springframework.beans.BeansException;
import com.study.springframework.beans.factory.config.BeanDefinition;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * cglib
 * @author fuguangwei
 * @date 2023-07-18
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (ctor != null) {
            return enhancer.create(ctor.getParameterTypes(), args);
        }
        return enhancer.create();
    }
}
