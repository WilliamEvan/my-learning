package com.wzx.pattern.adapter.demo.interfaceAdapter;

/**
 * 接口适配器实现，电源适配器，
 * 注：接口适配器区别类适配器和对象适配器：接口适配器侧重如接口实现，实现接口的多个方法
 */
public class Adatper implements DC {
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

    @Override
    public int outputDC8() {
        return 0;
    }

    @Override
    public int outputDC10() {
        return 0;
    }

    @Override
    public int outputDC16() {
        return 0;
    }
}
