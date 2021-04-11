package com.huazheng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.LocalTime.now;

/**
 * @author zhanghuazheng
 * @title: HelloController
 * @projectName springboot-study
 * @date 2021/4/8 8:08
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String doHello(){
        return "hello    21121 dsd"+ now();
    }
}
