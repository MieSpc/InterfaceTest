package com.auto.test.exceptions;

import com.auto.test.common.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public CommonResult customExceptionHandler(HttpServletRequest request,CustomException exception){
        return CommonResult.failed(exception.getBaseErrorCode());
    }

}
