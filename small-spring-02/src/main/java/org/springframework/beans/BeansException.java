package org.springframework.beans;

/**
 * @author fuguangwei
 * @date 2022-08-11
 */
public class BeansException extends RuntimeException {

    public BeansException() {
    }

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
