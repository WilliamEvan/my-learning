package com.wzx.example.ribbonuser.demo;

import org.springframework.beans.factory.annotation.Qualifier;
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
 * @ClassName: TestConfiguration
 * @date 2020/7/20
 */
@Configuration
public class TestConfiguration {

    @Qualifier
    @Bean
    public TestClass test1(){
        return new TestClass("test1");
    }
    @Qualifier
    @Bean
    public TestClass test2(){
        return new TestClass("test2");
    }
}
