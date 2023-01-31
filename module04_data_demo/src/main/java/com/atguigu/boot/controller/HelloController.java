package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 14:31  14:31
 * @Version: v1.0
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "<h1>hello,boot!</h1>";
    }

}
