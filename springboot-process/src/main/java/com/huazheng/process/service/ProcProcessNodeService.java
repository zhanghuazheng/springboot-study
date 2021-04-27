package com.huazheng.process.service;

import com.huazheng.process.flow.dao.ProcProcessNodeDao;
import com.huazheng.process.flow.entity.ProcProcessNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:流程处理节点关联表服务类
 * @Author: dongpo
 * @Date: 2019/3/24 17:23
 */
@Service
public class ProcProcessNodeService {

    @Autowired
    private ProcProcessNodeDao procProcessNodeDao;

    public List<ProcProcessNode> selectByProcessCode(String processCode){
        return procProcessNodeDao.selectByProcessCode(processCode);
    }
}
