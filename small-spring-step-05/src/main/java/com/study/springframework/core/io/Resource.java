package com.study.springframework.core.io;

import com.study.springframework.beans.BeansException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author fuguangwei
 * @date 2023-07-28
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
