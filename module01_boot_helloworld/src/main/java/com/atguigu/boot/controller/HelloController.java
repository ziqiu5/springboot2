package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/18 - 12:18  12:18
 * @Version: v1.0
 */

/**
 * 注解--》RestController
 * 1.拥有与注解Controller功能一样 创建该类的bean对象放入容器中管理,并且区分这是控制层,
 * 不写value属性时,其bean对象的id为首字母小写的类型(符合小驼峰形式)
 * 2.拥有与注解ResponseBody功能一样,方法的返回值作为服务端数据(响应体)响应到浏览器
 * @author ziqiu
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello,World!<br/>Hello,SpringBoot2!";
    }

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public String getPerson(){
        return person.toString();
    }

}
