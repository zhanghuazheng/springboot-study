package com.huazheng.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zhanghuazheng
 * @title: DataSourceConfig
 * @projectName springboot-study
 * @description: TODO
 * @date 2021/4/13 8:30
 */
@Data
@Component
@ConfigurationProperties(prefix = "zhz")
public class DataSourceConfig {
    private String str;

    private Integer num;

    private Double dnum;

    private Date birth;

    private List<String> hoby;

    private List<Integer> friend;

    private Map<String,Object> map;
}
