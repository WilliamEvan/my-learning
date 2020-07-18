package com.wzx.example.ribbonorder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderService {


    @Value("${server.port}")
    private int  port;

    @GetMapping("/getOrderInfo")
    public String getOrderInfo(){
        System.out.println("服务端口：" + port);
        return "this is a order!";
    }
}
