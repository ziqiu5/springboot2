package com.atguigu.boot.configure;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

/**
 * ClassName: MyConfigure
 * Package: com.atguigu.boot.configure
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/23 - 17:50  17:50
 * @Version: v1.0
 */

/**
 * 配置类 @Configuration
 * 属性:proxyBeanMethods,是否从代理池中寻找bean对象
 * true:每次创建新对象都从代理池中查找是否存在,此时为Full模式
 * false:每次新对象无需从代理池中查找 而是开辟空间创建对象 此时为Lite模式
 */
@Configuration(proxyBeanMethods = false)
public class MyConfigure {

    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper urlPathHelper = new UrlPathHelper();
                //设置不移除分号内容
                urlPathHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlPathHelper);
            }
        };
    }


}
