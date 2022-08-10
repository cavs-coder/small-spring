package org.springframework.test;

import org.springframework.BeanDefinition;
import org.springframework.BeanFactory;
import org.springframework.test.bean.UserService;

/**
 * @author fuguangwei
 * @date 2022-08-10
 */
public class ApiTest {

    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();

        //最小化版模拟，所以是new的UserService
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(new UserService()));

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();
    }
}
