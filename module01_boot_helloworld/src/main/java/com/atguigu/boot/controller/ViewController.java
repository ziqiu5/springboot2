package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: ViewController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/24 - 15:51  15:51
 * @Version: v1.0
 */

@Controller
public class ViewController {

    @RequestMapping("/helloThymeleaf")
    public String helloThymeleaf(Model model){
        model.addAttribute("msg","Thymeleaf" );

        return "success";
    }

}
