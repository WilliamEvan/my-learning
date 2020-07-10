package com.wzx.pattern.chain.builderchainexample;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: ExistCheck
 * @date 2020/7/10
 */
public class ExistCheck extends Handler {
    @Override
    public void doHandler(User user) {
        System.out.println("开始校验用户是否存在..");
        //校验失败
        if(!"张三".equals(user.getUserName())){
            System.out.println("用户不存在！");
            return;
        }
        //校验成功
        System.out.println("用户存在");
        if(this.next != null){
            this.next.doHandler(user);
        }
    }
}
