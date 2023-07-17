package com.study.springframework;

/**
 * @author fuguangwei
 * @date 2023-07-17
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
