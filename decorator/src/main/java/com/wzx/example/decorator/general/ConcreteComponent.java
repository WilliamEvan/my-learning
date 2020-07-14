package com.wzx.example.decorator.general;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: ConcreteCompent
 * @date 2020/7/14
 */
public class ConcreteComponent extends Component {
    @Override
    protected void operate() {

        System.out.println("这是标配！");
    }
}
