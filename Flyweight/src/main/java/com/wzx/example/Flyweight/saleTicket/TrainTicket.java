package com.wzx.example.flyweight.saleTicket;

public class TrainTicket implements Ticket{

    private String from;

    private String to;


    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        System.out.println(this.from +"->"+to +"座次："+bunk);
    }
}
