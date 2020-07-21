package com.wzx.pattern.adapter.passport.adapterv2.adapters;

import com.wzx.pattern.adapter.passport.ResultMsg;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: LoginForQQAdapter
 * @date 2020/7/21
 */
public class LoginForPhoneAdapter extends ParentAdapter{
    @Override
    public Boolean support(Object adapter) {
        return adapter instanceof ILoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if(!this.support(adapter)){return null;}
        return this.loginForRegister(id, null);
    }
}
