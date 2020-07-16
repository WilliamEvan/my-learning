package com.wzx.example.actuatordemo;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: SystemInfo
 * @date 2020/7/16
 */
public class SystemInfo implements SystemInfoMBean {
    @Override
    public int getCpuCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long totalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override
    public void shutDown() {
         System.exit(0);
    }
}
