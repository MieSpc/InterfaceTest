package com.auto.test.enums;

public interface BaseErrorCode {
    /**
     * 返回码
     */
    long getError_code();

    /**
     * 返回信息
     */
    String getError_message();

    /**
     * 提示信息
     * @return
     */
    String getHint_message();
}
