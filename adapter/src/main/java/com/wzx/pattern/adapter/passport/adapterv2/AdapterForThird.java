package com.wzx.pattern.adapter.passport.adapterv2;

import com.wzx.pattern.adapter.passport.ResultMsg;
import com.wzx.pattern.adapter.passport.adapterv2.adapters.ILoginAdapter;
import com.wzx.pattern.adapter.passport.adapterv2.adapters.LoginForQQAdapter;
import com.wzx.pattern.adapter.passport.adapterv2.adapters.ParentAdapter;

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
public class AdapterForThird implements IPassportForThird{


    @Override
    public ResultMsg loginForQQ(String QQOpenId) {
        this.loginHandler(QQOpenId, LoginForQQAdapter.class);
        return new ResultMsg(200,"qq登录成功", null);
    }

    @Override
    public ResultMsg loginForWechat(String WXOpenId) {
        return null;
    }

    @Override
    public ResultMsg loginForPhone(String phoneNum, String code) {
        return null;
    }

    //所有具体适配器都通过loginHandler为入口操作当前适配器
    public ResultMsg loginHandler(String id , Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
