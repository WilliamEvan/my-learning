package com.wzx.pattern.chain.example;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: Handler
 * @date 2020/7/10
 */
public abstract class Handler {

    protected Handler next;

    public void setNext(Handler source){
        this.next = source;
    }

    public abstract void doHandler(User user);
}
