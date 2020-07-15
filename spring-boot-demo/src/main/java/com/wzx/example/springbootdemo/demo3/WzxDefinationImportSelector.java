package com.wzx.example.springbootdemo.demo3;

import com.wzx.example.springbootdemo.demo1.MybatisConfiguration;
import com.wzx.example.springbootdemo.demo2.RedisTemplate;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: WzxDefinationImportSelector
 * @date 2020/7/14
 */
public class WzxDefinationImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{MybatisConfiguration.class.getName(), RedisTemplate.class.getName()};
    }
}
