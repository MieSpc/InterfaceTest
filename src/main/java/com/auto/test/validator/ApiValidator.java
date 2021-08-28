package com.auto.test.validator;

import com.alibaba.druid.util.StringUtils;
import com.auto.test.entity.ApiSaveRequest;
import com.auto.test.enums.ResultCode;
import com.auto.test.exceptions.CustomException;

import java.util.Objects;

public class ApiValidator {

    public static void validateCreateOrUpdateApi(ApiSaveRequest apiSaveRequest){

        if (Objects.nonNull(apiSaveRequest.getApiName()) && !StringUtils.isEmpty(apiSaveRequest.getApiName())
                && Objects.nonNull(apiSaveRequest.getApiUrl()) && Objects.nonNull(apiSaveRequest.getRequestMethod())
                && Objects.nonNull(apiSaveRequest.getApiParam()) && Objects.nonNull(apiSaveRequest.getApiHeader())){
            return;
        }else throw new CustomException(ResultCode.VALIDATE_FAILED);

    }
}
