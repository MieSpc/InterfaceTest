package com.auto.test.common;

public class CommonResult<T> {
    /**
     * 状态码
     */
    private long error_code;
    /**
     * 提示信息
     */
    private String error_message;
    /**
     * 提示信息
     */
    private String hint_message;
    /**
     * 数据封装
     */
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(long error_code, String error_message,String hint_message, T data) {
        this.error_code = error_code;
        this.error_message = error_message;
        this.hint_message = hint_message;
        this.data = data;
    }

    protected CommonResult(long error_code, String error_message, T data) {
        this.error_code = error_code;
        this.error_message = error_message;
        this.hint_message = "";
        this.data = data;
    }

    /**
     * 成功返回结果
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getError_code(),
                ResultCode.SUCCESS.getError_message(),
                ResultCode.SUCCESS.getHint_message(),
                data);
    }

    /**
     * 成功返回结果
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> success(T data, String message, String hintMessage) {
        return new CommonResult<T>(ResultCode.SUCCESS.getError_code(),
                message,
                hintMessage ,
                data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode) {
        return new CommonResult<T>(errorCode.getError_code(),
                errorCode.getError_message(),
                errorCode.getHint_message(),
                null);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param message 错误信息
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode,String message,String hintMessage) {
        return new CommonResult<T>(errorCode.getError_code(),
                message,
                hintMessage,
                null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> failed(String message,String hintMessage) {
        return new CommonResult<T>(ResultCode.FAILED.getError_code(),
                message,
                hintMessage,
                null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> validateFailed(String message,String hintMessage) {
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getError_code(),
                message,
                hintMessage,
                null);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getError_code(), ResultCode.UNAUTHORIZED.getError_message(), data);
    }

    /**
     * 禁止访问返回结果
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(ResultCode.FORBIDDEN.getError_code(), ResultCode.FORBIDDEN.getError_message(), data);
    }

    public long getError_code() {
        return error_code;
    }

    public void setError_code(long error_code) {
        this.error_code = error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getHint_message() {
        return hint_message;
    }

    public void setHint_message(String hint_message) {
        this.hint_message = hint_message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
