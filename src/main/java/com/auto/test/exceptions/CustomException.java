package com.auto.test.exceptions;

import com.auto.test.enums.BaseErrorCode;

public class CustomException extends RuntimeException{

    private static final long serialVersionUID = -145753733921282133L;

    private BaseErrorCode baseErrorCode;

    public CustomException(BaseErrorCode baseErrorCode){
        super(baseErrorCode.getError_message(),null);
        this.baseErrorCode = baseErrorCode;
    }

    public CustomException(BaseErrorCode baseErrorCode,Throwable cause){
        super(baseErrorCode.getError_message(),cause);
        this.baseErrorCode = baseErrorCode;
    }

    public BaseErrorCode getBaseErrorCode() {
        return baseErrorCode;
    }
}
