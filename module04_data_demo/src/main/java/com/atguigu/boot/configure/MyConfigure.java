package com.atguigu.boot.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: MyConfigure
 * Package: com.atguigu.boot.configure
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 14:39  14:39
 * @Version: v1.0
 */

@Configuration
public class MyConfigure implements WebMvcConfigurer {

    /**
     * 视图控制器
     * @param registry 注册中心
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
    }
}
