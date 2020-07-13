package com.wzx.example.flyweight.saleTicket;

import java.util.HashMap;
import java.util.Map;

public class TrainTicketFactory {

    private static Map<String, TrainTicket> trainTicketPool = new HashMap<>(16);


    public static TrainTicket queryTrainTicket(String from, String to){
        String key = from +"->"+ to ;
        if(!trainTicketPool.containsKey(key)){
            TrainTicket trainTicket = new TrainTicket(from, to);
            trainTicketPool.put(key, trainTicket);
            System.out.println("首次查询："+ from + "->" + to );
        } else {
            System.out.println("非首次查询：" + from + "->" + to );
        }

        return trainTicketPool.get(key);
    }
}
