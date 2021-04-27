package com.huazheng.process.flow.dao;

import com.huazheng.process.flow.entity.ProcProcess;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ProcProcessMapper数据库操作接口类
 */
@Repository
public interface ProcProcessDao {


    /**
     * 查询（根据主键ID查询）
     */
    ProcProcess selectById(@Param("id") Long id);


    /**
     * 删除（根据主键ID删除）
     */
    int deleteById(@Param("id") Long id);


    /**
     * 添加
     */
    int insert(ProcProcess record);


    /**
     * 添加 （匹配有值的字段）
     */
    int insertSelective(ProcProcess record);


    /**
     * 修改 （匹配有值的字段）
     */
    int updateByIdSelective(ProcProcess record);

    /**
     * 查询所有流程
     */
    List<ProcProcess> selectAll();

    /**
     * 通过applyChannel查询
     */
    List<ProcProcess> selectByApplyChannel(@Param("applyChannel") Integer applyChannel);

}