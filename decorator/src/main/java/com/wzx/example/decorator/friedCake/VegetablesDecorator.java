package com.wzx.example.decorator.friedCake;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: VegetablesDecorator
 * @date 2020/7/14
 */
public class VegetablesDecorator extends CakeDecorator {
    public VegetablesDecorator(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加蔬菜";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
