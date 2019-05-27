package com.cqupt.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/**
 * @Description: 参数校验注解
 *
 * @Author: hetiantian
 * @Date:2019/05/27 21:00
 * @Version: 1.0
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {
    /**
     * 合法的参数值
     * */
    String[] validateParamValue();
}
