package com.study.springframework;

import com.study.springframework.bean.UserService;
import com.study.springframework.config.BeanDefinition;
import com.study.springframework.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public class ApiTest {

    @Test
    public void test() {
        //1、初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3、获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService2 = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
