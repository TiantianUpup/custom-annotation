package com.cqupt.annotation.controller;

import com.cqupt.annotation.CustomCache;
import com.cqupt.annotation.PermissionCheck;
import com.cqupt.annotation.vo.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
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
@RestController
public class TestController {
    @PostMapping("/api/test")
    public Object test(@Validated @RequestBody User user) {
        return "hello world";
    }

    @GetMapping("/api/test")
    @PermissionCheck(resourceKey = "test")
    public Object testPermissionCheck() {
        return "hello world";
    }

    @GetMapping("/api/cache")
    @CustomCache(key = "test")
    public Object testCustomCache() {
        return "don't hit cache";
    }

}
