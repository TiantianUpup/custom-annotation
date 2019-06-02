package com.cqupt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 自定义缓存注解
 *
 * @Author: hetiantian
 * @Date:2019/06/02 09:55
 * @Version: 1.0
 */
@Target({ ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomCache {
    /**
     * 缓存的key值
     * */
    String key();
}
