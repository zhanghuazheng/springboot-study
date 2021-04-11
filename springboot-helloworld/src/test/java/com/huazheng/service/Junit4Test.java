package com.huazheng.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhanghuazheng
 * @title: Junit4Test
 * @projectName springboot-study
 * @date 2021/4/11 10:41
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class Junit4Test {
    @Autowired
    private HelloService helloService;

    @Test
    public void testBase(){
        System.out.println("Junit4 最基本的测试");
    }

    @Before
    @Test
    public void testBefore(){
        System.out.println("Junit4 测试");
    }

    @Test
    public void testService(){
        System.out.println("Junit4 helloService = "+ helloService);
    }

    @Test
    public void testAssert(){
        Assert.assertEquals("期望值是2",2,3);
    }


}
