package com.duan.seata.feign;

//@LocalTCC
public interface OrderFeign {

//    @TwoPhaseBusinessAction(name = "OrderServiceApi", commitMethod = "commit", rollbackMethod = "rollback")
//    @RequestMapping("/addOrder")
//    boolean prepare(@RequestBody BusinessActionContext businessActionContext, @RequestParam("userId") @BusinessActionContextParameter(paramName = "userId") String userId,
//                    @RequestParam("commodityCode") @BusinessActionContextParameter(paramName = "commodityCode") String commodityCode,
//                    @RequestParam("count") @BusinessActionContextParameter(paramName = "count") Integer count,
//                    @RequestParam("money") @BusinessActionContextParameter(paramName = "money") Double money);
//
//    @RequestMapping("/addOrder/commit")
//    boolean commit(@RequestBody BusinessActionContext businessActionContext);
//
//    @RequestMapping("/addOrder/rollback")
//    boolean rollback(@RequestBody BusinessActionContext businessActionContext);
}
