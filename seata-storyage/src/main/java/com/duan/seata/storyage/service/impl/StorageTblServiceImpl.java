package com.duan.seata.storyage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duan.seata.storyage.entity.StorageTbl;
import com.duan.seata.storyage.mapper.StorageTblMapper;
import com.duan.seata.storyage.service.StorageTblService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-20
 */
@Service
@Slf4j
public class StorageTblServiceImpl extends ServiceImpl<StorageTblMapper, StorageTbl> implements StorageTblService {

    @Resource
    private StorageTblMapper storageTblMapper;
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public boolean prepare(String commodityCode, Integer count) {
//        StorageTbl StorageTbl = storageTblMapper.getCountByCommodityCode(commodityCode);
//        if (Objects.isNull(StorageTbl)) {
//            throw new RuntimeException("商品不存在");
//        }
//        if (StorageTbl.getCount() < count) {
//            throw new RuntimeException("商品数量不足，扣库存失败");
//        }
//        // 冻结商品数量
//        StorageTbl.setFreezeCount(StorageTbl.getFreezeCount() + count);
//        StorageTbl.setCount(StorageTbl.getCount() - count);
//        Integer result = storageTblMapper.updateStorageTbl(StorageTbl);
//        log.info("{} 商品预扣 {} 件", commodityCode, count);
//        return result == 1;
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public boolean commit(BusinessActionContext businessActionContext) {
//        // 获取 prepare 阶段的两个参数
//        String commodityCode = (String) businessActionContext.getActionContext("commodityCode");
//        Integer count = (Integer) businessActionContext.getActionContext("count");
//        StorageTbl StorageTbl = storageTblMapper.getCountByCommodityCode(commodityCode);
//        if (StorageTbl.getFreezeCount() < count) {
//            throw new RuntimeException("商品数量不足，扣库存失败");
//        }
//        StorageTbl.setFreezeCount(StorageTbl.getFreezeCount() - count);
//        Integer result = storageTblMapper.updateStorageTbl(StorageTbl);
//        log.info("{} 商品扣 {} 件", commodityCode, count);
//        return result == 1;
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public boolean rollback(BusinessActionContext businessActionContext) {
//        // 获取 prepare 阶段的两个参数
//        String commodityCode = (String) businessActionContext.getActionContext("commodityCode");
//        Integer count = (Integer) businessActionContext.getActionContext("count");
//        StorageTbl StorageTbl = storageTblMapper.getCountByCommodityCode(commodityCode);
//        if (Objects.isNull(StorageTbl)) {
//            log.info("{} 商品不存在", commodityCode);
//            return true;
//        }
//        if (StorageTbl.getFreezeCount() >= count) {
//            StorageTbl.setCount(StorageTbl.getCount() + count);
//            StorageTbl.setFreezeCount(StorageTbl.getFreezeCount() - count);
//            Integer result = storageTblMapper.updateStorageTbl(StorageTbl);
//            log.info("库存释放冻结 {} 商品 {} 件", commodityCode, count);
//            return result == 1;
//        }
//        log.info("库存不需要释放冻结 {} 商品", commodityCode);
//        return true;
//    }
}
