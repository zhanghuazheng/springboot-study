package com.huazheng.process.flow.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 流程处理节点关联表
 */
@Data
public class ProcProcessNode implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 更新时间 */
	private java.util.Date modified;

	/** 创建时间 */
	private java.util.Date created;

	/** 自增主键 */
	private Long id;

	/** 流程编码 */
	private String processCode;

	/** 节点编码 */
	private String nodeCode;

	/** 节点名称 */
	private String nodeName;

	/** 节点跳转url */
	private String nodeUrl;

	/** 父节点 */
	private String parentCode;

	/** 是否删除，0否，1是 */
	private Integer isDel;

}
