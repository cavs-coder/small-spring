package com.study.springframework.util;

/**
 * @author fuguangwei
 * @date 2023-07-28
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Exception e) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}
