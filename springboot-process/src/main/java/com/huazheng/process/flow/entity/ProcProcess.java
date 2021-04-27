package com.huazheng.process.flow.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 流程定义表
 */
@Data
public class ProcProcess implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 更新时间
     */
    private java.util.Date modified;

    /**
     * 创建时间
     */
    private java.util.Date created;

    /**
     * 自增主键
     */
    private Long id;

    /**
     * 流程编码
     */
    private String processCode;

    /**
     * 流程名称
     */
    private String processName;

    /**
     * 应用渠道(0：Pay伴app 1：手百借现金小程序),默认是0
     */
    private Integer applyChannel;

    /**
     * 是否删除，0否，1是
     */
    private Integer isDel;

}
