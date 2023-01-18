package com.duan.seata.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单名称
     */
    private String name;

    /**
     * 总价格
     */
    private BigDecimal price;

    /**
     * 运费
     */
    private BigDecimal transportPrice;

    /**
     * 实付款
     */
    private BigDecimal payment;

    /**
     * 订单编号
     */
    private String code;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    private Long updateBy;

    /**
     * 更新人
     */
    private LocalDateTime updateTime;


}
