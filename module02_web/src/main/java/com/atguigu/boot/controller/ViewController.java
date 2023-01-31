package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: ViewController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/24 - 15:39  15:39
 * @Version: v1.0
 */

@Controller
public class ViewController {

    @RequestMapping("/atguigu")
    public String atguigu(){
        System.out.println("进入了atguigu方法");
        return "success";
    }


}
