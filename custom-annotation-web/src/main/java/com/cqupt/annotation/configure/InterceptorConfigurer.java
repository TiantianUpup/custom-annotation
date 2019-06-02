package com.cqupt.annotation.configure;

import com.cqupt.annotation.interceptor.PermissionCheckInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: 拦截器配置类
 *
 * @Author: hetiantian
 * @Date:2019/6/2 9:23 
 * @Version: 1.0
 */
@Configuration
public class InterceptorConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //权限验证拦截
        registry.addInterceptor(new PermissionCheckInterceptor()).addPathPatterns("/api/test");

        super.addInterceptors(registry);
    }
}
