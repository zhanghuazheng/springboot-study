package com.huazheng.service;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


/**
 * @author zhanghuazheng
 * @projectName springboot-study
 * @date 2021/4/9 8:35
 */
@SpringBootTest
@DisplayName(value = "junit5测试")
public class Junit5Test {
    @Autowired
    HelloService helloService;

    @Test
    public void contextLoader() {
        assertAll("test",
                ()->assertEquals(1,1,"期望值不是1"),
                ()->assertNull(null));
        System.out.println("assertAll执行");
    }

    @Test
    public void helloTest() {
        System.out.println("111");
    }

    @Test
    @BeforeEach
    public void helloTest2() {
        System.out.println("每个方法都执行内容");
    }

    @Test
    @BeforeAll
    @DisplayName("测试方法开始")
    public static void beforeAlltest() {
        System.out.println("测试方法开始");
    }

    @Test
    public void testService() {
        System.out.println(helloService);
    }


    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,56,67,7})
    public void testParamTest(int i){
        System.out.println(i);
    }
}
