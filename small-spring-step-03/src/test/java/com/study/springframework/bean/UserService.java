package com.study.springframework.bean;

/**
 * @author fuguangwei
 * @date 2023-07-16
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + name);
    }
}
