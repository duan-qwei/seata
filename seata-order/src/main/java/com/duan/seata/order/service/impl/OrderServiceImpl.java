package com.duan.seata.order.service.impl;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duan.seata.order.entity.Order;
import com.duan.seata.order.mapper.OrderMapper;
import com.duan.seata.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-18
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addOrder() {
        Order order = new Order();
        order.setCode("2394892834");
        order.setId(IdWorker.getId());
        order.setName("cesasdasdhi");
        save(order);
    }
}
