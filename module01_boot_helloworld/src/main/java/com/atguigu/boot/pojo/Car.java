package com.atguigu.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * ClassName: Car
 * Package: com.atguigu.boot.pojo
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/18 - 20:28  20:28
 * @Version: v1.0
 */

/**
 * 注解--》 Component: 将该类在IOC容器中注册
 * 注解--》 ConfigurationProperties(prefix = "car"): 将springboot的配置文件中car前缀的值注入该类的属性 并将
 * 创建该类的bean对象交给IOC容器去管理(前提一定是需要让SpringBoot认识该类,即需要使用注解--》 Component 在IOC容器中注册该类)
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "car")
public class Car {
    private String name;
    private BigDecimal price;

}
