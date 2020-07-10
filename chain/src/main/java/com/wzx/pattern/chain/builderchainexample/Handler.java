package com.wzx.pattern.chain.builderchainexample;

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
public abstract class Handler<T> {

    protected Handler next;

    public void setNext(Handler source){
        this.next = source;
    }

    public abstract void doHandler(User user);

    //记住这个内部类的写法
    public static class Builder<T>{
        private Handler<T> head;
        private Handler<T> tail;
        public Builder<T> addHandler(Handler handler){
            if (this.head == null){
                //链为空，头尾都为handler
                this.head = this.tail = handler;
            } else {
                //从尾部开始追加，当前尾部的next赋值为handler
                this.tail.next = handler;
                //尾部赋值为handler
                this.tail = handler;
            }
            return this;
        }
        public Handler builder(){
            return this.head;
        }
    }
}
