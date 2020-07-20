package com.wzx.pattern.adapter.demo.interfaceAdapter;


public class Test {

    public static void main(String[] args) {

        Adatper adatper = new Adatper(new AC220());
        int dc = adatper.outputDC5();
        System.out.println("通过适配器转换获取"+dc+"伏电流");
        //这里需要多少伏都可以输出
//        adatper.outputDC8();
//        adatper.outputDC10();
//        adatper.outputDC16();
    }
}
