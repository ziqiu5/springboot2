package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * ClassName: UserController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/24 - 21:33  21:33
 * @Version: v1.0
 */

@Controller
public class UserController {

    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session) {
        System.out.println(user);
        if("ziqiu".equals(user.getUsername())&&"123".equals(user.getPassword())){
            //登录成功 将user保存到session域中
            session.setAttribute("user", user);
            //将登录成功的用户信息共享到请求域中
            model.addAttribute("user", user);
            //请求重定向返回首页 避免表单的重复提交
            return "redirect:/index";
        }
        //若未登录成功 将错误信息共享在请求域中提示用户
        model.addAttribute("msg", "用户名或密码有误！");
        return "login";
    }

    @RequestMapping("/signOut")
    public String signOut(HttpSession session){
        //销毁session 即使session失效
        session.invalidate();
        return "redirect:/index";
    }


}
