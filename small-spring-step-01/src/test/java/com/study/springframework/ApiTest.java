package com.study.springframework;

import com.study.springframework.bean.UserService;
import com.study.springframework.beans.BeanDefinition;
import com.study.springframework.beans.BeanFactory;
import org.junit.jupiter.api.Test;

/**
 * @author fuguangwei
 * @date 2023-07-16
 */
public class ApiTest {

    @Test
    public void test() {
        //1、初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3、获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
