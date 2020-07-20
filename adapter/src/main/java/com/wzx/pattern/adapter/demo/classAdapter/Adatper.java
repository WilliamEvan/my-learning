package com.wzx.pattern.adapter.demo.classAdapter;

/**
 * 类适配器实现，电源适配器，
 * 注：这里使用的是继承，按照设计模式原则尽量少继承多组合
 */
public class Adatper extends AC220 implements DC5{
    @Override
    public int outputDC5() {
        //讲220伏电压转换成5伏电流
        int dc = super.outputAC220() / 44;
        return dc;
    }
}
