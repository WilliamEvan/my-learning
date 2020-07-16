package com.wzx.example.actuatordemo;

import org.apache.catalina.mbeans.MBeanFactory;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * 暴露自定义的jmx
 */
public class JMXMain {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, IOException {
        //声明一个平台的MbeanServer
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("com.wzx.example.actuatordemo：type=SystemInfo");
        SystemInfo systemInfo = new SystemInfo();
        server.registerMBean(systemInfo, objectName);
        //避免main方法结束
        System.in.read();
    }
}
