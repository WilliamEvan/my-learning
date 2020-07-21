package com.wzx.pattern.adapter.passport.adapterv1;

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
        AdapterForThird apatper = new AdapterForThird();
        ResultMsg msg = apatper.loginForQQ("sdfsadsf");
        ResultMsg msg2 = apatper.loginForPhone("1896","123123");
        System.out.println(msg.toString());
        System.out.println(msg2.toString());
    }
}
