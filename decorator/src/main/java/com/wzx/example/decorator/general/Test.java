package com.wzx.example.decorator.general;

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
        ConcreteComponent c = new ConcreteComponent();
        DecoratorA decoratorA = new DecoratorA(c);
        decoratorA.operate();
        DecoratorB decoratorB = new DecoratorB(c);
        decoratorB.operate();
        DecoratorA decoratorA1 = new DecoratorA(decoratorB);
        decoratorA1.operate();
        /****
         * 运行结果：
         * 装饰器A的first扩展
         * 这是标配！
         * 装饰器A的last扩展
         * 装饰器B的first扩展
         * 这是标配！
         * 装饰器B的last扩展
         * 装饰器A的first扩展
         * 装饰器B的first扩展
         * 这是标配！
         * 装饰器B的last扩展
         * 装饰器A的last扩展
         *
         * Process finished with exit code 0
         */

    }
}
