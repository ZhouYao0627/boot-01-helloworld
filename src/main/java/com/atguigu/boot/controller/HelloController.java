package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 @author：ZhouYao
 @create：2021-12-23 19:09
 */

//@ResponseBody // 返回的话要以字符串的方式写给浏览器
//@Controller
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "hello,springboot2";
    }



}
