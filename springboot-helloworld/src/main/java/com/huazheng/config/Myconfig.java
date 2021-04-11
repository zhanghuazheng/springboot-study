package com.huazheng.config;

import com.huazheng.controller.HelloController;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhanghuazheng
 * @title: Myconfig
 * @projectName springboot-study
 * @date 2021/4/9 8:26
 */
@Import({HelloController.class})
@Configuration
public class Myconfig {
}
