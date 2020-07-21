package com.wzx.pattern.adapter.passport.adapterv2.adapters;

import com.wzx.pattern.adapter.passport.ResultMsg;

/**
 * 接口定义一个标准
 */
public interface ILoginAdapter {

    Boolean support(Object o);

    ResultMsg login(String id, Object adapter);
}
