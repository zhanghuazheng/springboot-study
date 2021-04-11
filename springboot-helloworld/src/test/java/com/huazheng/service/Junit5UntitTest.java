package com.huazheng.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author zhanghuazheng
 * @title: Junit5UntitTest
 * @projectName springboot-study
 * @date 2021/4/11 12:03
 */
public class Junit5UntitTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,56,67,7})
    public void testParamTest(int i){
        System.out.println(i);
    }
}
