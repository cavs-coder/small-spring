package com.study.springframework;

import com.study.springframework.bean.UserService;
import com.study.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.study.springframework.beans.factory.xml.XmlBeanDefinitionReader;
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

        //2、读取配置文件、注册bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        //3、获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
