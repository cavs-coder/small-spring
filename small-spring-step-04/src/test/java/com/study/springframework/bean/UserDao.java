package com.study.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fuguangwei
 * @date 2023-07-19
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "A");
        hashMap.put("10002", "B");
        hashMap.put("10003", "C");
    }

    public String queryNameById(String id) {
        return hashMap.get(id);
    }
}
