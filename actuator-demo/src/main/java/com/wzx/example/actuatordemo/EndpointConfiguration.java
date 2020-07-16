package com.wzx.example.actuatordemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: CustomerConfiguration
 * @date 2020/7/16
 */
@Configuration
public class EndpointConfiguration {

    @Bean
    public CustomerMetricsIndicator setCustomerMetricsIndicator(){
        return new CustomerMetricsIndicator();
    }
    @Bean
    public CustomerHealthIndicator setCustomerHealthIndicator(){
        return new CustomerHealthIndicator();
    }
}
