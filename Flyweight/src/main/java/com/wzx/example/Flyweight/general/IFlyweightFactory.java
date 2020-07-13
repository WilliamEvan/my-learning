package com.wzx.example.Flyweight.general;

import java.util.HashMap;
import java.util.Map;

public class IFlyweightFactory {

    private static Map<String, IFlyweightConcrete> pool = new HashMap<>(16);

    public IFlyweight getFlyweight(String key){
        IFlyweightConcrete flyweightConcrete = null;
        if(!pool.containsKey(key)){
            //缓存池中没有当前key的对象，创建对象
            flyweightConcrete = new IFlyweightConcrete();
            pool.put(key, flyweightConcrete);

        }
        return pool.get(key);

    }
}
