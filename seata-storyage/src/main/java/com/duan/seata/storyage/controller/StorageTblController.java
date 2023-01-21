package com.duan.seata.storyage.controller;


import com.duan.seata.feign.StorageFeign;
import com.duan.seata.storyage.service.StorageTblService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-20
 */
@RestController
public class StorageTblController implements StorageFeign {

    @Resource
    private StorageTblService storageTblService;

//    @Override
//    public boolean prepare(BusinessActionContext businessActionContext, String commodityCode, Integer count) {
//        return storageTblService.prepare(commodityCode, count);
//    }
//
//    @Override
//    public boolean commit(BusinessActionContext businessActionContext) {
//        return storageTblService.commit(businessActionContext);
//    }
//
//    @Override
//    public boolean rollback(BusinessActionContext businessActionContext) {
//        return storageTblService.rollback(businessActionContext);
//    }
}

