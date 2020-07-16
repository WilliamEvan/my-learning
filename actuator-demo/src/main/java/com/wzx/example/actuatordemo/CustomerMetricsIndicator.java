package com.wzx.example.actuatordemo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义Metrics
 */
@Endpoint(id = "customer")
public class CustomerMetricsIndicator{

    @ReadOperation
    public Map<String, Object> systemTime(){
        Map<String, Object> result  = new HashMap<>(16);
        long currentTimeMillis = System.currentTimeMillis();
        result.put("time", currentTimeMillis);
        return result;
    }
}
