package com.duan.seata.user.controller;


import com.duan.seata.user.service.SUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-17
 */
@RestController
@RequestMapping("/sUser")
public class SUserController {

    @Resource
    private SUserService userService;

    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public void addOrder(){
        userService.addOrder();
    }
}

