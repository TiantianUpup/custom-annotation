package com.cqupt.annotation.controller;

import com.cqupt.annotation.vo.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description: 测试控制类
 *
 * @Author: hetiantian
 * @Date:2019/5/27 21:36 
 * @Version: 1.0
 */
@RestController("/api/test")
public class TestController {
    @PostMapping
    public Object test(@Validated @RequestBody User user) {
        return "hello world";
    }
}
