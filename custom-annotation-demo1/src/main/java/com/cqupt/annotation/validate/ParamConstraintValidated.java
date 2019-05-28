package com.cqupt.annotation.validate;

import com.cqupt.annotation.Check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 验证注解
 *
 * @Author: hetiantian
 * @Date:2019/5/27 21:21 
 * @Version: 1.0
 */
public class ParamConstraintValidated implements ConstraintValidator<Check, Object> {
    /**
     * 合法的参数值，从注解中获取
     * */
    private List<String> paramValues;

    @Override
    public void initialize(Check constraintAnnotation) {
        //初始化时获取注解上的值
        paramValues = Arrays.asList(constraintAnnotation.paramValues());
    }

    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        if (paramValues.contains(o)) {
            return true;
        }

        //不在指定的参数列表中
        return false;
    }
}
