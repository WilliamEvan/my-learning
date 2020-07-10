package com.wzx.pattern.chain.builderchainexample;

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

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ExistCheck())
                .addHandler(new PasswordCheck())
                .addHandler(new RoleCheck());

        User user= new User();
        user.setUserName("张三");
        user.setPassword("111");
        user.setRole("管理员");
        builder.builder().doHandler(user);
    }
}
