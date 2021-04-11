package com.huazheng.service;

import org.springframework.stereotype.Service;

/**
 * @author zhanghuazheng
 * @title: HelloService
 * @projectName springboot-study
 * @date 2021/4/9 8:34
 */
@Service
public class HelloService {
    public void doHelloService(){
        System.out.println("doHelloService execute");
    }
}
