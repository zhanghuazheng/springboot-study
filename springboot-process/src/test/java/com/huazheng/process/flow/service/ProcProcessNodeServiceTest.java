package com.huazheng.process.flow.service;

import com.huazheng.process.flow.entity.ProcProcessNode;
import com.huazheng.process.service.ProcProcessNodeService;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

/**
 * @author zhanghuazheng
 * @date 2021/4/27 17:40
 */

@SpringBootTest
class ProcProcessNodeServiceTest {

    @Autowired
    private ProcProcessNodeService procProcessNodeService;

    @Test
    void selectByProcessCode() {
        List<ProcProcessNode> nodeList = procProcessNodeService.selectByProcessCode("cc001");
        nodeList.stream().forEach(System.out::print);
        System.out.println("***************************************");
        Optional<ProcProcessNode> processNodeOptional = nodeList.stream().
                filter(node -> StringUtils.isBlank(node.getParentCode())).findFirst();
        if (processNodeOptional.isPresent()) {
            System.out.println(processNodeOptional.get());
        }
    }
}