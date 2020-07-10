package com.wzx.pattern.chain.builderchainexample;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: PasswordCheck
 * @date 2020/7/10
 */
public class PasswordCheck extends Handler {
    @Override
    public void doHandler(User user) {
        System.out.println("开始校验用户密码..");
        //校验失败
        if(!"0000".equals(user.getPassword())){
            System.out.println("校验用户密码失败，请重新输入");
            return;
        }
        //校验成功
        System.out.println("校验用户密码成功");
        if(this.next != null){
            this.next.doHandler(user);
        }
    }
}
