package com.auto.test.common;

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功","success"),
    FAILED(500, "操作失败","failed"),
    VALIDATE_FAILED(422, "请求参数错误","param validate Failed"),
    UNAUTHORIZED(401, "没有相关权限","unauthorized"),
    FORBIDDEN(403, "禁止访问","forbidden");
    private long error_code;
    private String error_message;
    private String hint_message;

    private ResultCode(long error_code, String error_message,String hint_message) {
        this.error_code = error_code;
        this.error_message = error_message;
        this.hint_message = hint_message;
    }

    public long getError_code() {
        return error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public String getHint_message() {
        return hint_message;
    }
}
