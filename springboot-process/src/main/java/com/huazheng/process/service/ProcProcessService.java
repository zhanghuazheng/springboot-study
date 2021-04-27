package com.huazheng.process.service;


import com.huazheng.process.flow.dao.ProcProcessDao;
import com.huazheng.process.flow.entity.ProcProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:流程定义表服务类
 * @Author: dongpo
 * @Date: 2019/3/24 17:10
 */
@Service
public class ProcProcessService {

    @Autowired
    private ProcProcessDao procProcessDao;

    public List<ProcProcess> getAllProcess() {
        return procProcessDao.selectAll();
    }

    public List<ProcProcess> selectByApplyChannel(Integer applyChannel) {
        return procProcessDao.selectByApplyChannel(applyChannel);
    }
}
