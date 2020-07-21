package com.wzx.pattern.adapter.passport;

/**
 * 用户注册登录
 */
public class PassportForUser {

    public ResultMsg registerMember(String userName, String password){
        System.out.println("注册。。。");
        return new ResultMsg(200, "注册成功", null);
    }

    public ResultMsg getPassport(String userName, String password){
        System.out.println("登录。。。");
        return new ResultMsg(200, "登录成功", null);
    }

}
