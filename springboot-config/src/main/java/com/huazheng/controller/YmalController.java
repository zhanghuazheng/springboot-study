package com.huazheng.controller;

import com.huazheng.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghuazheng
 * @title: YmalController
 * @projectName springboot-study
 * @description: TODO
 * @date 2021/4/13 8:52
 */
@RestController
public class YmalController {
    @Autowired
    private DataSourceConfig dataSourceConfig;

    @RequestMapping("/yaml")
    public String getDataConfig(){
        System.out.println(dataSourceConfig);
        return dataSourceConfig.toString();
    }
}
