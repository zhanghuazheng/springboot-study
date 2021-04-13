package com.huazheng.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhanghuazheng
 * @title: Pet
 * @projectName springboot-study
 * @description: 宠物
 * @date 2021/4/12 7:56
 */
@Configuration
public class Pet {

    private String type;

    private String name;
}
