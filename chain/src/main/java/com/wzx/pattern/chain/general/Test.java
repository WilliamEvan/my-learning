package com.wzx.pattern.chain.general;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: Test
 * @date 2020/7/10
 */
public class Test {

    public static void main(String[] args) {
        ChainNodeA nodeA = new ChainNodeA();
        ChainNodeB nodeB = new ChainNodeB();
        nodeB.setNextHandler(nodeA);
        //干活
        nodeB.requestHandler("request-1");

    }
}
