package com.wzx.pattern.adapter.passport.adapterv2.adapters;

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
 * @ClassName: ParentAdapter
 * @date 2020/7/21
 */
public abstract class ParentAdapter extends PassportForUser implements ILoginAdapter {
    //先注册再登录
    public ResultMsg loginForRegister(String userName, String password){
        if(StringUtils.isEmpty(password)){
            password = "default_password";
        }
        super.registerMember(userName, password);
        return super.getPassport(userName, password);
    }
}
