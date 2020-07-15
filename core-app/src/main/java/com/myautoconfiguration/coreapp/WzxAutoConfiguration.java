package com.myautoconfiguration.coreapp;

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
 * @ClassName: WzxAutoConfiguration
 * @date 2020/7/15
 */
@Configuration
public class WzxAutoConfiguration {

    @Bean
    public WzxCoreApp getCore(){
        return  new WzxCoreApp();
    }
}
