package com.atguigu.boot.configure;

import com.atguigu.boot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: MyConfigure
 * Package: com.atguigu.boot.configure
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/24 - 20:54  20:54
 * @Version: v1.0
 */

@Configuration(proxyBeanMethods = false)
public class AdminWebConfig implements WebMvcConfigurer {

    /**
     * 添加视图控制器
     * @param registry 注册视图控制器
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
    }

    /**
     * 配置拦截器
     * @param registry 拦截器的注册中心
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/index","/login","/registration","/css/**","/fonts/**",
                        "/images/**","/js/**","/sql");

    }


}
