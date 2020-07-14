package com.wzx.example.decorator.general;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: DecoratorA
 * @date 2020/7/14
 */
public class DecoratorA  extends Decorator{
    public DecoratorA(Component component) {
        super(component);
    }

    private void firstOperate(){
        System.out.println("装饰器A的first扩展");
    }
    private void lastOperate(){
        System.out.println("装饰器A的last扩展");
    }

    @Override
    protected void operate() {
        firstOperate();
        super.operate();
        lastOperate();
    }

}
