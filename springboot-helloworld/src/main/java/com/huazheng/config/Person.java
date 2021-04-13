package com.huazheng.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 * @author zhanghuazheng
 * @title: Person
 * @projectName springboot-study
 * @description: TODO
 * @date 2021/4/12 7:58
 */
@Configuration
@ConfigurationProperties()
@Data
public class Person {

    private String name;

    private List<String> hobby;

    private Map<String,Pet> pet;


}
