package com.atguigu.boot;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author ziqiu
 */

@Slf4j
@MapperScan(value = "com.atguigu.boot.mapper")
@ServletComponentScan(basePackages = "com.atguigu.boot")
@SpringBootApplication
public class Module03BackStageDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Module03BackStageDemoApplication.class, args);
    }

}
