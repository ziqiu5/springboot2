package com.atguigu.boot.controller;

import com.atguigu.boot.error.EmpTooManyException;
import com.atguigu.boot.error.UserTooManyException;
import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.pojo.Emp;
import com.atguigu.boot.pojo.User;
import com.atguigu.boot.service.EmpService;
import com.atguigu.boot.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sun.deploy.net.HttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    @Autowired
    private EmpService empService;

    @RequestMapping("/basic_table")
    public String basicTable() {
        log.info("/basic_table被访问");
        return "table/basic_table";
    }

    @RequestMapping(value = "/delEmp/{empId}")
    public String deleteEmp(@PathVariable("empId") Long empId, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int res = empService.deleteEmpById(empId);
        System.out.println("res = " + res);
        // 请求头中的Referer参数是请求发送过来的原页面地址 即req.getHeader("Referer")
        // 请求重定向回原页面
        String referer = req.getHeader("Referer");
        return "redirect:" + referer;
    }

    @RequestMapping("/emp/{pageNo}/{empId}")
    public String queryEmpById(@PathVariable("pageNo") Integer pageNo, @PathVariable("empId") Long empId, Model model) {
        Emp emp = empService.queryEmpById(empId);
        model.addAttribute("emp", emp);
        model.addAttribute("pageNo", pageNo);
        return "emp/update";
    }

    @PostMapping("/update_emp/{pageNo}")
    public String updateEmp(Emp emp, @PathVariable("pageNo") Integer pageNo) {
        int res = empService.updateEmp(emp);
        System.out.println("res = " + res);
        return "redirect:/dynamic_table/" + pageNo;
    }


    @RequestMapping("/dynamic_table/{pageNo}")
    public String dynamicTable(@PathVariable("pageNo") Integer pageNo, Model model) {
        Page<Emp> empPage = new Page<>(pageNo, 5);
        Page<Emp> page = empService.page(empPage, null);
        int empCount = page.getRecords().size();
        System.out.println("empCount = " + empCount);
        if (empCount > 100) {
            throw new EmpTooManyException();
        }
        model.addAttribute("page", page);

        return "table/dynamic_table";
    }

    @RequestMapping("/responsive_table")
    public String responsiveTable() {
        return "table/responsive_table";
    }

    @RequestMapping("/editable_table")
    public String editableTable() {
        return "table/editable_table";
    }


}
