package com.wzx.pattern.adapter.demo.classAdapter;

public class Test {

    public static void main(String[] args) {

//        //这里不仅可以输出需要的电流，还可输出电压，不满足最少知道原则，
//        Adatper adatper = new Adatper();
//        int dc = adatper.outputDC5();
//        int ac = adatper.outputAC220();
//        System.out.println("通过适配器转换获取"+dc+"电流");
//        System.out.println("这里还可以输出"+ac+"电压");


        DC5 dcOnly= new Adatper();
        System.out.println("输出"+dcOnly.outputDC5()+"伏电流");

    }
}
