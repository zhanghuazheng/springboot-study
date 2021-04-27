package com.huazheng.process.controller;

import com.huazheng.process.flow.entity.ProcProcessNode;
import com.huazheng.process.service.ProcProcessNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhanghuazheng
 * @date 2021/4/27 17:13
 */
@RestController
@RequestMapping("/test")
public class ProcessController {

    @Autowired
    private ProcProcessNodeService procProcessNodeService;

    @RequestMapping("/process")
    public String getProcess(){
        List<ProcProcessNode> procProcessNodeList = procProcessNodeService.selectByProcessCode("cc001");
        procProcessNodeList.stream().forEach(System.out::print);
        return "sucess";

    }
}
