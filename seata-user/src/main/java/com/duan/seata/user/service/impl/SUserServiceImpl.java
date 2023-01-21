package com.duan.seata.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duan.seata.user.entity.SUser;
import com.duan.seata.user.mapper.SUserMapper;
import com.duan.seata.user.service.SUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-17
 */
@Service
public class SUserServiceImpl extends ServiceImpl<SUserMapper, SUser> implements SUserService {

    @Override
    public void addOrder(String userId, String commodityCode, Integer count, Double money) {
//        // 获取全局事务的 ID
//        String xid = RootContext.getXID();
//        BusinessActionContext businessActionContext = new BusinessActionContext();
//        businessActionContext.setXid(xid);
//        storageFeign.prepare(businessActionContext, commodityCode, count);
//        orderFeign.prepare(businessActionContext, userId, commodityCode, count, money);
    }
}
