package com.atguigu.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author ziqiu
 */

@Slf4j
@ServletComponentScan(basePackages = "com.atguigu.boot")
@SpringBootApplication
public class Module03BackStageDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Module03BackStageDemoApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            log.info(name);
        }


    }

}
