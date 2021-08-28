package com.auto.test.enums;

public enum ApiErrorCode implements BaseErrorCode{
    API_EXIT(1001,"api接口已存在","api interface already exit"),
    API_NOT_FOUND(1002,"api接口未找到","api interface not found")
    ;

    private long error_code;
    private String error_message;
    private String hint_message;

    ApiErrorCode(long error_code, String error_message, String hint_message) {
        this.error_code = error_code;
        this.error_message = error_message;
        this.hint_message = hint_message;
    }

    @Override
    public long getError_code() {
        return this.error_code;
    }

    @Override
    public String getError_message() {
        return this.error_message;
    }

    @Override
    public String getHint_message() {
        return this.hint_message;
    }
}
