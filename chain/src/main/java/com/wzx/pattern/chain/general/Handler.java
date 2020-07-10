package com.wzx.pattern.chain.general;

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

    protected Handler nextHandler;
    /***
     *当前handler持有下一个handler对象
     */
    public void setNextHandler(Handler sourceHandler){
        this.nextHandler = sourceHandler;
    }
    /***
     *每一个handler处理的业务
     */
    public abstract void requestHandler(String request);

}
