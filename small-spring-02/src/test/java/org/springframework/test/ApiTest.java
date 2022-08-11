package org.springframework.test;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.bean.UserService;

/**
 * @author fuguangwei
 * @date 2022-08-11
 */
public class ApiTest {

    public static void main(String[] args) {
        //1、初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        String beanName = "userService";

        //2、注册 bean
        beanFactory.registerBeanDefinition(beanName, new BeanDefinition(UserService.class));

        //3.1、第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean(beanName);
        System.out.println("1: " + userService);
        userService.queryUserInfo();

        System.out.println("===");

        //3.2、第二次获取 bean
        UserService userService2 = (UserService) beanFactory.getBean(beanName);
        System.out.println("2: " + userService2);
        userService2.queryUserInfo();
    }
}
