package com.wzx.pattern.adapter.demo.objectAdapter;


public class Test {

    public static void main(String[] args) {

        Adatper adatper = new Adatper(new AC220());
        int dc = adatper.outputDC5();
        System.out.println("通过适配器转换获取"+dc+"伏电流");
    }
}
