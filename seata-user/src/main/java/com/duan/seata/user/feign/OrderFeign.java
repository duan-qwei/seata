package com.duan.seata.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * description
 *
 * @author duanqiangwei
 * @date 2023/1/18 17:10
 */
@FeignClient(name = "SEATA-ORDER",url = "http://localhost:9092/order")
public interface OrderFeign {

    @PostMapping("/addOrder")
    void addOrder();
}
