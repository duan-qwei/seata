package com.duan.seata.user.service.impl;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duan.seata.user.entity.SUser;
import com.duan.seata.user.feign.OrderFeign;
import com.duan.seata.user.mapper.SUserMapper;
import com.duan.seata.user.service.SUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

    @Autowired
    private OrderFeign orderFeign;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addOrder() {
        SUser user = new SUser();
        user.setId(IdWorker.getId());
        user.setUserName("nihao" + IdWorker.getMillisecond());
        user.setPhone("1835645690156");
        user.setEmail("dusdfwei@gmail.com");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        save(user);
        orderFeign.addOrder();
        Integer res = 1 / 0;
    }
}
