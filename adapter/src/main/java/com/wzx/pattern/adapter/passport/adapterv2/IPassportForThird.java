package com.wzx.pattern.adapter.passport.adapterv2;

import com.wzx.pattern.adapter.passport.ResultMsg;

/**
 * 兼容第三方注册登录
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String QQOpenId);

    ResultMsg loginForWechat(String WXOpenId);

    ResultMsg loginForPhone(String phoneNum, String code);

}
