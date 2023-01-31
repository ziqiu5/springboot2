package com.atguigu.boot.controller;

import com.atguigu.boot.error.UserTooManyException;
import com.atguigu.boot.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: TableController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/24 - 23:40  23:40
 * @Version: v1.0
 */

@Controller
@Slf4j
public class TableController {

    @RequestMapping("/basic_table")
    public String basic_table() {
        log.info("/basic_table被访问");
        return "table/basic_table";
    }

    @RequestMapping("/dynamic_table")
    public String dynamic_table(Model model) {
        List<User> users = Arrays.asList(new User("xiaolong", "456"), new User("xiaohong", "789")
                , new User("haha", "745"), new User("hehe", "4657"), new User("xioakang", "dsa56"),
                new User("haieqh", "dsa5489"));
        model.addAttribute("users", users);

        if(users.size() > 3){
            throw new UserTooManyException();
        }

        return "table/dynamic_table";
    }

    @RequestMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }

    @RequestMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }


}
