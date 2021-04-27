package com.huazheng.process.flow.dao;

import com.huazheng.process.flow.entity.ProcProcessNode;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ProcProcessNodeMapper数据库操作接口类
 */
@Repository
public interface ProcProcessNodeDao {


    /**
     * 查询（根据主键ID查询）
     */
    ProcProcessNode selectById(@Param("id") Long id);


    /**
     * 删除（根据主键ID删除）
     */
    int deleteById(@Param("id") Long id);


    /**
     * 添加
     */
    int insert(ProcProcessNode record);


    /**
     * 添加 （匹配有值的字段）
     */
    int insertSelective(ProcProcessNode record);


    /**
     * 修改 （匹配有值的字段）
     */
    int updateByIdSelective(ProcProcessNode record);

    /**
     * 通过流程节点查询所有记录
     */
    List<ProcProcessNode> selectByProcessCode(String processCode);
}