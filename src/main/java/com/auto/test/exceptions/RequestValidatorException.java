package com.auto.test.exceptions;

public class RequestValidatorException extends CustomException{
    public RequestValidatorException(String msg) {
        super(msg);
    }

    public RequestValidatorException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public RequestValidatorException(String msg, String reason) {
        super(msg, reason);
    }

    public RequestValidatorException(String msg, String reason, Throwable cause) {
        super(msg, reason, cause);
    }
}
