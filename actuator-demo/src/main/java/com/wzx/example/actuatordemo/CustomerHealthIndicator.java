package com.wzx.example.actuatordemo;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

/**
 * 自定义健康监控信息
 */
public class CustomerHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {

            builder.up().withDetail("testHealthInfo", "健康");
    }
}
