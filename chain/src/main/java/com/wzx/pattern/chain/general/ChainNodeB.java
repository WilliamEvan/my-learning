package com.wzx.pattern.chain.general;


/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: ChainNodeA
 * @date 2020/7/10
 */
public class ChainNodeB extends Handler {
    @Override
    public void requestHandler(String request) {
        System.out.println(this.getClass().getSimpleName() + " deal with " + request);

        /***
         * 下一个Handler不为空，交给下一个处理
         */
        if(this.nextHandler != null){
            this.nextHandler.requestHandler(request);
        }
    }
}
