package com.duan.seata.storyage.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.duan.seata.storyage.entity.StorageTbl;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-20
 */
public interface StorageTblMapper extends BaseMapper<StorageTbl> {

    @Select("select * from storage_tbl where commodity_code = #{commodityCode}")
    StorageTbl getCountByCommodityCode(@Param("commodityCode") String commodityCode);

    @Update("update storage_tbl set count = #{count}, freeze_count = #{freezeCount} where commodity_code = #{commodityCode}")
    Integer updateStorage(StorageTbl storage);
}
