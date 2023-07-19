package com.study.springframework.bean;

/**
 * @author fuguangwei
 * @date 2023-07-16
 */
public class UserService {

    private String id;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + userDao.queryNameById(id));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
