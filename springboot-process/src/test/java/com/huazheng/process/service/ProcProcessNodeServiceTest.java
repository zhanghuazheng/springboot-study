package com.huazheng.process.service;

import com.huazheng.process.flow.entity.ProcProcessNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhanghuazheng
 * @date 2021/4/29 14:58
 */
@SpringBootTest
class ProcProcessNodeServiceTest {

    @Autowired
    ProcProcessNodeService procProcessNodeService;

    @Test
    void selectByProcessCode() {
    }

    @Test
    void getCreditProcess() {
        HashMap<String, ProcProcessNode> result = procProcessNodeService.getCreditProcess("cc001");
        System.out.println("执行结束，流程结果-->"+result.entrySet());
    }

    @Test
    void getCreditProcessWithKey() {
        List<String> result = procProcessNodeService.getCreditProcessWithKey("cc001");
        System.out.println("执行结束，流程结果-->"+result);
    }
}