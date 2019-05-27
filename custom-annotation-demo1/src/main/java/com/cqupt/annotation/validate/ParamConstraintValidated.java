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
    //先写死，可以从properties文件中读取
    private List<String> validateParam = Arrays.asList("man", "woman");
    @Override
    public void initialize(Check constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        if (validateParam.contains(o)) {
            return true;
        }

        //不在指定的参数列表中
        return false;
    }
}
