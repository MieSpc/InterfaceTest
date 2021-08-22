package com.auto.test.exceptions;

public class CustomException extends RuntimeException{

    private String reason;

    public CustomException(String msg){
        this(msg,"");
    }

    public CustomException(String msg, Throwable cause){
        this(msg,"", cause);
    }

    public CustomException(String msg,String reason){
        super(msg);
        this.reason = reason;
    }

    public CustomException(String msg, String reason ,Throwable cause){
        super(msg,cause);
        this.reason = reason;
    }

    public String getReason() {
        return this.reason == null ? "" :this.reason;
    }
}
