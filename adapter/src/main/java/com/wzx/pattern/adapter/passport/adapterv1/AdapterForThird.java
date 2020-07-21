package com.wzx.pattern.adapter.passport.adapterv1;

import com.wzx.pattern.adapter.passport.PassportForUser;
import com.wzx.pattern.adapter.passport.ResultMsg;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: ApatperForThird
 * @date 2020/7/21
 */
public class AdapterForThird extends PassportForUser implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String QQOpenId) {
        this.loginForRegister(QQOpenId, null);
        return new ResultMsg(200,"qq登录成功", null);
    }

    @Override
    public ResultMsg loginForWechat(String WXOpenId) {
        this.loginForRegister(WXOpenId, null);
        return new ResultMsg(200,"微信登录成功", null);
    }

    @Override
    public ResultMsg loginForPhone(String phoneNum, String code) {
        this.loginForRegister(phoneNum, null);
        return new ResultMsg(200,"手机号登录成功", null);
    }

    //先注册再登录
    public ResultMsg loginForRegister(String userName, String password){
        if(StringUtils.isEmpty(password)){
            password = "default_password";
        }
        super.registerMember(userName, password);
        return super.getPassport(userName, password);
    }
}
