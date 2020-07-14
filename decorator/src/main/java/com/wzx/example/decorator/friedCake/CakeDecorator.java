package com.wzx.example.decorator.friedCake;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: CakeDecorator
 * @date 2020/7/14
 */
public abstract class CakeDecorator extends  CakeComponent {

    private CakeComponent cakeComponent;

    public CakeDecorator(CakeComponent cakeComponent) {
        this.cakeComponent = cakeComponent;
    }

    @Override
    protected String getMsg() {
        return cakeComponent.getMsg();
    }

    @Override
    protected int getPrice() {
        return cakeComponent.getPrice();
    }
}
