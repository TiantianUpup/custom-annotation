package com.cqupt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 权限校验注解
 *
 * @Author: hetiantian
 * @Date:2019/06/02 09:07
 * @Version: 1.0
 */
@Target({ ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PermissionCheck {
    /**
     * 资源key
     * */
    String resourceKey();
}
