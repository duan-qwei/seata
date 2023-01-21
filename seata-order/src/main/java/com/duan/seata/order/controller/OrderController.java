//package com.duan.seata.order.controller;
//
//
//import com.duan.seata.feign.OrderFeign;
//import com.duan.seata.order.service.OrderService;
//import io.seata.rm.tcc.api.BusinessActionContext;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * <p>
// *  前端控制器
// * </p>
// *
// * @author duanqiangwei
// * @since 2023-01-18
// */
//@RestController
//public class OrderController implements OrderFeign {
//
//    @Resource
//    private OrderService orderService;
//
//
//    @Override
//    public boolean prepare(BusinessActionContext businessActionContext, String userId, String commodityCode, Integer count, Double money) {
//        return orderService.prepare(businessActionContext, userId, commodityCode, count, money);
//    }
//
//    @Override
//    public boolean commit(BusinessActionContext businessActionContext) {
//        return orderService.commit(businessActionContext);
//    }
//
//    @Override
//    public boolean rollback(BusinessActionContext businessActionContext) {
//        return orderService.rollback(businessActionContext);
//    }
//}
//
