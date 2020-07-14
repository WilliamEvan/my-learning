package com.wzx.example.decorator.general;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: decorator
 * @date 2020/7/14
 */
public abstract class Decorator extends Component{

    /***
     * 抽象装饰器必须持有抽象组件对象
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    protected void operate() {
         component.operate();
    }
}
