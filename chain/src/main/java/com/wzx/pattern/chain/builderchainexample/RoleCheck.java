package com.wzx.pattern.chain.builderchainexample;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: RoleCheck
 * @date 2020/7/10
 */
public class RoleCheck extends Handler {

    @Override
    public void doHandler(User user) {
        System.out.println("开始校验用户角色..");
        //校验失败
        if(!"管理员".equals(user.getRole())){
            System.out.println("您不是管理员无权操作当前模块！");
            return;
        }
        //校验成功
        System.out.println("管理员校验成功");
        if(this.next != null){
            this.next.doHandler(user);
        }
    }
}
