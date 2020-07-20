package com.wzx.pattern.adapter.general;

/**
 * 适配器分为三类，类适配器、对象适配器、接口适配器
 * 适配器多用于后期业务代码优化，或者前期预留用于后期代码优化
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public Object method2() {
        Object o = super.method1();
        //对 o 进行加工  返回目标对象
        //....
        //返回目标对象
        return o;
    }
}
