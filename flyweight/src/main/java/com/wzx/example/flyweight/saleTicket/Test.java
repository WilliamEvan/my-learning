package com.wzx.example.flyweight.saleTicket;

public class Test {

    public static void main(String[] args) {
        TrainTicket ticket = TrainTicketFactory.queryTrainTicket("杭州", "合肥");
        ticket.showInfo("软座");
        TrainTicket ticket1 = TrainTicketFactory.queryTrainTicket("杭州", "合肥");
        ticket1.showInfo("硬座");
    }
}
