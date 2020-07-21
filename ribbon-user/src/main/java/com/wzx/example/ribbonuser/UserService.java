package com.wzx.example.ribbonuser;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserService {

    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;
    //使用方式2
    @Bean
    @LoadBalanced
    public void SetRestTemplate(){
        restTemplate = new RestTemplate();
    }

    @Bean
    public IRule ribbonRule(){
        //设置为随机负载，默认是轮询
        return new RandomRule();
    }

    @GetMapping("/getUserOrder")
    public String getUserOrder(){
        return  restTemplate.getForObject("http://spring-cloud-ribbon-order/getOrderInfo", String.class);
    }

//    使用方式1
//    @Bean
//    public IRule ribbonRule(){
//        //设置为随机负载，默认是轮询
//        return new RandomRule();
//    }
//
//    @GetMapping("/getUserOrder")
//    public String getUserOrder(){
//        ServiceInstance instance = loadBalancerClient.choose("spring-cloud-ribbon-order");
//        String url = String.format("http://%s:%s"+"/getOrderInfo", instance.getHost(), instance.getPort());
//        return  restTemplate.getForObject(url, String.class);
//    }
}
