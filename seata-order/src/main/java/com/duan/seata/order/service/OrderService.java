package com.duan.seata.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duan.seata.order.entity.Order;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-18
 */
public interface OrderService extends IService<Order> {

    void addOrder();
}
