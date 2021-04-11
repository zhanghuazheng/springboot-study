package com.huazheng.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhanghuazheng
 * @title: Junit4AssertTest
 * @projectName springboot-study
 * @date 2021/4/11 11:43
 */
public class Junit4AssertTest {
    @Autowired
    private HelloService helloService;
    @Test
    public void testAssert(){
        Assert.assertEquals("期望值是2",2,2);
    }

    @Test
    public void testSpringAssert(){
        org.springframework.util.Assert.isNull(helloService,"helloService不能是null");
    }

    @Test
    public void testSpringAssert2(){
        org.springframework.util.Assert.notNull(helloService,"helloService不能是null");
    }
}
