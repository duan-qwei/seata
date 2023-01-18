package com.duan.seata.order.controller;


import com.duan.seata.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-18
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;


    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public void addOrder(){
        orderService.addOrder();
    }
}

