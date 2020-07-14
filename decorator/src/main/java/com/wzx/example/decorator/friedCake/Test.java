package com.wzx.example.decorator.friedCake;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: Test
 * @date 2020/7/14
 */
public class Test {
    public static void main(String[] args) {
        BaseCake baseCake = new BaseCake();
        //在最低配煎饼果子上加个鸡蛋
        EggDecorator eggDecorator = new EggDecorator(baseCake);
        System.out.println(eggDecorator.getMsg() +"; 花费："+ eggDecorator.getPrice());
        //再加个蔬菜
        VegetablesDecorator vegetablesDecorator = new VegetablesDecorator(eggDecorator);
        System.out.println(vegetablesDecorator.getMsg() +"; 花费："+ vegetablesDecorator.getPrice());

        //再加个鸡蛋
        EggDecorator eggDecorator1 = new EggDecorator(vegetablesDecorator);
        System.out.println(eggDecorator1.getMsg() +"; 花费："+ eggDecorator1.getPrice());

        /***
         * 运行结果：
         * 一个基础版煎饼果子加一个鸡蛋; 花费：10
         * 一个基础版煎饼果子加一个鸡蛋加蔬菜; 花费：11
         * 一个基础版煎饼果子加一个鸡蛋加蔬菜加一个鸡蛋; 花费：13
         */
    }
}
