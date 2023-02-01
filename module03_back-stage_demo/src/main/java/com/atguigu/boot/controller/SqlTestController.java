package com.atguigu.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: SqlTestController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 13:08  13:08
 * @Version: v1.0
 */

@Controller
public class SqlTestController {

    @Autowired(required = false)
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/sql")
    @ResponseBody
    public String sqlTest(){
        String sql = "select count(*) from `user`";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return "总记录数: " + count;
    }






}
