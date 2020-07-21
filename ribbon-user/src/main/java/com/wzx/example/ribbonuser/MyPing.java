package com.wzx.example.ribbonuser;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: MyPing
 * @date 2020/7/20
 */
public class MyPing implements IPing {
    @Override
    public boolean isAlive(Server server) {
        return true;
    }
}
