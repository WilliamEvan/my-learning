package com.wzx.pattern.adapter.demo.objectAdapter;

/**
 * 对象适配器实现，电源适配器，
 * 注：使用组合代替继承，通过构成方法组合对象
 */
public class Adatper implements DC5 {
    private AC220 ac220;

    public Adatper(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        //讲220伏电压转换成5伏电流
        int dc = ac220.outputAC220() / 44;
        return dc;
    }
}
