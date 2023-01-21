package com.duan.seata.feign;

//@LocalTCC
public interface AccountFeign {

//    /*
//    prepare 是开发者手动调用的，commit 或 rollback 则是 seata 根据 prepare(所有的) 执行的情况，自动调用的。
//     */
//
//    /**
//     * 一阶段操作
//     * 检查资源，如：检查账户是否存在，检查账户余额是否充足，余额充足的话，就冻结余额。
//     * @return
//     */
//    @TwoPhaseBusinessAction(name = "accountServiceApi", commitMethod = "commit", rollbackMethod = "rollback")
//    @RequestMapping("/account/deduct/prepare")
//    boolean prepare(@RequestBody BusinessActionContext businessActionContext, @RequestParam("userId") @BusinessActionContextParameter(paramName = "userId") String userId, @RequestParam("money") @BusinessActionContextParameter(paramName = "money") Double money);
//
//    /**
//     * 二阶段提交
//     * 提交，主要是扣款操作（操作冻结金额即可）。
//     * @return
//     */
//    @RequestMapping("/account/deduct/commit")
//    boolean commit(@RequestBody BusinessActionContext businessActionContext);
//
//    /**
//     * 二阶段回滚
//     * 回滚，将冻结的金额复原。
//     * @return
//     */
//    @RequestMapping("/account/deduct/rollback")
//    boolean rollback(@RequestBody BusinessActionContext businessActionContext);
}
