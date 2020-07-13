package com.wzx.example.flyweight.general;

public class Test {

    public static void main(String[] args) {
        IFlyweightFactory flyweightFactory = new IFlyweightFactory();
        for(int i = 0; i < 5; i++) {
            IFlyweight flyweight = flyweightFactory.getFlyweight("享元" + i);
            System.out.println("享元" + i+ "hash值：" + flyweight.hashCode());
        }
        System.out.println("------------------分割线---------------");
        IFlyweight flyweight1 = flyweightFactory.getFlyweight("享元" + 1);
        IFlyweight flyweight3 = flyweightFactory.getFlyweight("享元" + 3);
        System.out.println("享元1hash值：" + flyweight1.hashCode());
        System.out.println("享元3hash值：" + flyweight3.hashCode());
    }
}
