package com.huazheng.process;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.huazheng.process.flow.dao")
public class ProcessMain {
    public static void main(String[] args) {
        SpringApplication.run(ProcessMain.class,args);
    }
}
