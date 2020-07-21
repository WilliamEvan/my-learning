package com.wzx.example.ribbonuser.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: TestController
 * @date 2020/7/20
 */
@RestController
public class TestController {

    //Qualifier注解的作用：标记作用，这里表示将所有加了Qualifier注解的bean,加载到testList中
    @Qualifier
    @Autowired
    private List<TestClass>  testList;

    @GetMapping("/get")
    public Object get(){
        return testList;
    }
}
