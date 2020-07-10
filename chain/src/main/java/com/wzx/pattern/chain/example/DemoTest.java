package com.wzx.pattern.chain.example;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: DemoTest
 * @date 2020/7/10
 */
public class DemoTest {

    public static void main(String[] args) {
        ExistCheck existCheck = new ExistCheck();
        PasswordCheck passwordCheck = new PasswordCheck();
        RoleCheck roleCheck = new RoleCheck();
        existCheck.setNext(passwordCheck);
        passwordCheck.setNext(roleCheck);

        User user= new User();
        user.setUserName("张三");
        user.setPassword("0000");
        user.setRole("管理员");
        existCheck.doHandler(user);
    }
}
