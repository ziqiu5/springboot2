package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: TestController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/19 - 17:31  17:31
 * @Version: v1.0
 */

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,springboot2~";
    }


    @RequestMapping("/user/{pageNum}")
    public Map getParam(@PathVariable("pageNum") Integer pageNum) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("pageNum", pageNum);
        return map;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Map getRequestBody(@RequestBody String content,
                              @RequestHeader Map<String, String> requestHeaderMaps,
                              @RequestHeader("cookie") String cookie,
                              @RequestParam("username") String username,
                              @RequestParam("password") String password) {
        System.out.println(content);
        Set<Map.Entry<String, String>> entries = requestHeaderMaps.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Map<String, Object> map = new HashMap<>(16);
        map.put("content", content);
        System.out.println("============================");
        System.out.println(cookie);
        System.out.println("********************************");
        System.out.println(username);
        System.out.println(password);
        return map;
    }

    @RequestMapping("/cars/{sell}")
    public Map testMatrixVariable(@MatrixVariable("low") String low,
                                  @MatrixVariable("brand")String brand,
                                  @PathVariable("sell")String sell){
        Map<String,Object> map = new HashMap<>(16);
        map.put("low",low );
        map.put("brand",brand );
        System.out.println(sell);
        return map;
    }


}
