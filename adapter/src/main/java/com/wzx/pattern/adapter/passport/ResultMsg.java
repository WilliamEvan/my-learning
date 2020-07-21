package com.wzx.pattern.adapter.passport;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author wangzx
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: ResultMsg
 * @date 2020/7/21
 */
public class ResultMsg {

    private int resultCode;

    private String resultMessage;

    private String data;

    public ResultMsg(int resultCode, String resultMessage, String data) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.data = data;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "resultCode=" + resultCode +
                ", resultMessage='" + resultMessage + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
