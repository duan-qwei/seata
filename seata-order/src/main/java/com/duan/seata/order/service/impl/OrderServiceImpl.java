package com.duan.seata.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duan.seata.order.entity.Order;
import com.duan.seata.order.mapper.OrderMapper;
import com.duan.seata.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-18
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Resource
    private OrderMapper orderMapper;

//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public boolean prepare(BusinessActionContext businessActionContext, String userId, String commodityCode, Integer count, Double money) {
//        // 扣款
//        //boolean result = accountFeign.prepare(businessActionContext, userId, money);
//        log.info("用户：{}，商品：{}，数量：{}，总价：{}；预下单成功", userId, commodityCode, count, money);
//        return Boolean.TRUE;
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public boolean commit(BusinessActionContext businessActionContext) {
//        String userId = ((String) businessActionContext.getActionContext("userId"));
//        String commodityCode = ((String) businessActionContext.getActionContext("commodityCode"));
//        Integer count = ((Integer) businessActionContext.getActionContext("count"));
//        Double money = ((BigDecimal) businessActionContext.getActionContext("money")).doubleValue();
//        Integer result = orderMapper.addOrder(userId, commodityCode, count, money);
//        log.info("用户：{}，商品：{}，数量：{}，总价：{}；下单成功", userId, commodityCode, count, money);
//        return result == 1;
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public boolean rollback(BusinessActionContext businessActionContext) {
//        String userId = ((String) businessActionContext.getActionContext("userId"));
//        String commodityCode = ((String) businessActionContext.getActionContext("commodityCode"));
//        Integer count = ((Integer) businessActionContext.getActionContext("count"));
//        Double money = ((BigDecimal) businessActionContext.getActionContext("money")).doubleValue();
//        log.info("用户：{}，商品：{}，数量：{}，总价：{}；订单回滚成功", userId, commodityCode, count, money);
//        return true;
//    }
}
