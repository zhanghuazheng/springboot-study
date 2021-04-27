/**
 * FileName: ProcProcessNodeBo
 * Author:   xuqi
 * Date:     2020/2/3 10:58
 * Description: ai花封装ProcProcessNode
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.huazheng.process.flow.entity;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈ai花封装ProcProcessNode〉
 *
 * @author xuqi
 * @create 2020/2/3
 * @since 1.0.0
 */
@Data
public class ProcProcessNodeBo extends ProcProcessNode {
    /**
     * 首页下一跳
     */
    private String nextNode;
}