package com.wzx.example.actuatordemo;

/**
 * 自定义JMX展示信息
 * 注意：接口命名必须以MBean结尾，实现类名必须是去除MBean的接口名
 */
public interface SystemInfoMBean {

    int getCpuCore();

    long totalMemory();

    void shutDown();
}
