package com.zookeeper.autoconfiguration;

import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: ZookeeperAutoConfiguration
 * @date 2020/7/15
 */
@ConditionalOnClass(ZooKeeper.class)
@Configuration
public class ZookeeperAutoConfiguration implements InitializingBean {

    private StringBuffer stringBuffer;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("测试自动装配+Bean初始化");
        stringBuffer = new StringBuffer();
    }

}
