package com.duan.seata.feign;

//@LocalTCC
public interface StorageFeign {

//    @TwoPhaseBusinessAction(name = "StorageServiceApi", commitMethod = "commit", rollbackMethod = "rollback")
//    @RequestMapping("/storage/deduct/prepare")
//    boolean prepare(@RequestBody BusinessActionContext businessActionContext, @RequestParam("commodityCode") @BusinessActionContextParameter(paramName = "commodityCode") String commodityCode, @RequestParam("count") @BusinessActionContextParameter(paramName = "count") Integer count);
//
//    @RequestMapping("/storage/deduct/commit")
//    boolean commit(@RequestBody BusinessActionContext businessActionContext);
//
//    @RequestMapping("/storage/deduct/rollback")
//    boolean rollback(@RequestBody BusinessActionContext businessActionContext);
}
