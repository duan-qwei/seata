package com.duan.seata.order.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.duan.seata.order.entity.Order;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-18
 */
public interface OrderMapper extends BaseMapper<Order> {

//    @Insert("insert into order_tbl (user_id, commodity_code, count, money) values (#{userId}, #{commodityCode}, #{count}, #{money})")
//    Integer addOrder(@Param("userId") String userId, @Param("commodityCode") String commodityCode, @Param("count") Integer count, @Param("money") Double money);

}
