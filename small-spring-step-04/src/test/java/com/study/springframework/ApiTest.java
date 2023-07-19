package com.study.springframework;

import com.study.springframework.bean.UserDao;
import com.study.springframework.bean.UserService;
import com.study.springframework.beans.PropertyValue;
import com.study.springframework.beans.PropertyValues;
import com.study.springframework.beans.factory.config.BeanDefinition;
import com.study.springframework.beans.factory.config.BeanReference;
import com.study.springframework.beans.factory.support.DefaultListableBeanFactory;
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

        //2、注册 UserDao
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        //3、UserService 设置属性类
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("id", "10002"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        //4、注册UserService
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));

        //5、获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
