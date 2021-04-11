package com.huazheng.utils.mybatis;


import java.io.InputStream;

/**
 * @author zhanghuazheng
 * @title: Resources
 * @projectName springboot-study
 * @description: 获取指定配置文件的数据流
 * @date 2021/4/11 19:20
 */
public class Resources {
    public static InputStream getResourceAsStream(String path){
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(path);

        return resourceAsStream;
    }
}
