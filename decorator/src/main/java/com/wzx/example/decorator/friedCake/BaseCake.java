package com.wzx.example.decorator.friedCake;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: BaseCake
 * @date 2020/7/14
 */
public class BaseCake extends CakeComponent {

    @Override
    protected String getMsg() {
        return "一个基础版煎饼果子";
    }

    @Override
    protected int getPrice() {
        return 8;
    }
}
