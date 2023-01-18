package com.duan.seata.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duan.seata.user.entity.SUser;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-17
 */
public interface SUserService extends IService<SUser> {

    void addOrder();
}
