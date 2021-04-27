package com.huazheng.process.flow.dao;

import com.huazheng.process.flow.entity.ProcNode;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * ProcNodeMapper数据库操作接口类
 */
@Repository
public interface ProcNodeDao {


	/**
	 * 查询（根据主键ID查询）
	 */
	ProcNode selectById(@Param("id") Long id);


	/**
	 * 删除（根据主键ID删除）
	 */
	int deleteById(@Param("id") Long id);


	/**
	 * 添加
	 */
	int insert(ProcNode record);


	/**
	 * 添加 （匹配有值的字段）
	 */
	int insertSelective(ProcNode record);


	/**
	 * 修改 （匹配有值的字段）
	 */
	int updateByIdSelective(ProcNode record);

}