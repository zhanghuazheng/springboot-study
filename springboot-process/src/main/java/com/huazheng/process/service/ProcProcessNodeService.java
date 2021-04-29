package com.huazheng.process.service;

import com.huazheng.process.flow.dao.ProcProcessNodeDao;
import com.huazheng.process.flow.entity.ProcProcessNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

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

    public HashMap<String, ProcProcessNode> getCreditProcess(String processCode){
        HashMap<String, ProcProcessNode> map = new HashMap<>();
        String nodeCode = "";
        List<ProcProcessNode> procProcessNodes = procProcessNodeDao.selectByProcessCode(processCode);
        Optional<ProcProcessNode> first = procProcessNodes.stream().filter(x -> StringUtils.isEmpty(x.getParentCode())).findFirst();
        if(first.isPresent()){
             nodeCode = first.get().getNodeCode();
            map.put(first.get().getNodeName(),first.get());
            getNextNode(procProcessNodes,nodeCode,map);
        }

        return map;

    }

    public List<String> getCreditProcessWithKey(String processCode){
        List<String> list = new ArrayList<>();
        String nodeCode = "";
        List<ProcProcessNode> procProcessNodes = procProcessNodeDao.selectByProcessCode(processCode);
        Optional<ProcProcessNode> first = procProcessNodes.stream().filter(x -> StringUtils.isEmpty(x.getParentCode())).findFirst();
        if(first.isPresent()){
            nodeCode = first.get().getNodeCode();
            list.add(first.get().getNodeName());
            getNextNode(procProcessNodes,nodeCode,list);
        }
        return list;

    }



    private void getNextNode(List<ProcProcessNode> dataLists,String currentNode,HashMap<String, ProcProcessNode> map){
        ProcProcessNode nextNode = null;
        List<ProcProcessNode> collect = dataLists.stream()
                .filter(x -> currentNode.equals(x.getParentCode()))
                .collect(Collectors.toList());
        if(!CollectionUtils.isEmpty(collect)){
            nextNode = collect.get(0);
            System.out.println("nextNode="+nextNode.getNodeCode()+"nodeProcess = "+ map);
            map.put(nextNode.getNodeName(),nextNode);
            getNextNode(dataLists, nextNode.getNodeCode(), map);
        }

    }

    private void getNextNode(List<ProcProcessNode> dataLists,String currentNode,List<String> map){
        ProcProcessNode nextNode = null;
        List<ProcProcessNode> collect = dataLists.stream()
                .filter(x -> currentNode.equals(x.getParentCode()))
                .collect(Collectors.toList());
        if(!CollectionUtils.isEmpty(collect)){
            nextNode = collect.get(0);
//            System.out.println("nextNode="+nextNode.getNodeCode()+"nodeProcess = "+ map);
            map.add(nextNode.getNodeName());
            getNextNode(dataLists, nextNode.getNodeCode(), map);
        }

    }
}
