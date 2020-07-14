package com.wzx.example.decorator.friedCake;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: EggDecorator
 * @date 2020/7/14
 */
public class EggDecorator extends CakeDecorator{

    public EggDecorator(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
