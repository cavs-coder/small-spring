package com.study.springframework.core.io;

import org.springframework.util.ResourceUtils;

/**
 * @author fuguangwei
 * @date 2023-07-28
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:".
     */
    String CLASSPATH_URL_PREFIX = ResourceUtils.CLASSPATH_URL_PREFIX;

    Resource getResource(String location);

}
