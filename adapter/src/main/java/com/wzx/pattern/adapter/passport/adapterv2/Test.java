package com.wzx.pattern.adapter.passport.adapterv2;

import com.wzx.pattern.adapter.passport.ResultMsg;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: Test
 * @date 2020/7/21
 */
public class Test {

    public static void main(String[] args) {
        AdapterForThird adapter = new AdapterForThird();
        ResultMsg msg = adapter.loginForQQ("sdfsadsf");

        System.out.println(msg.toString());

    }
}
