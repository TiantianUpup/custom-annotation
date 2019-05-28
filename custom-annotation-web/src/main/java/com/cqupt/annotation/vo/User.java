package com.cqupt.annotation.vo;

import com.cqupt.annotation.Check;
import lombok.Data;

/**
 * @Description: 用户实体
 *
 * @Author: hetiantian
 * @Date:2019/5/27 21:33 
 * @Version: 1.0
 */
@Data
public class User {
    /**
     * 姓名
     * */
    private String name;

    /**
     * 性别 man or women
     * */
    @Check(paramValues = {"man", "woman"})
    private String sex;
}
