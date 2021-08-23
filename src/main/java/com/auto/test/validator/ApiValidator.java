package com.auto.test.validator;

import com.alibaba.druid.util.StringUtils;
import com.auto.test.entity.ApiRequestEntity;
import com.auto.test.enums.HeaderType;
import com.auto.test.enums.ParamType;
import com.auto.test.exceptions.RequestValidatorException;

import java.util.Objects;

public class ApiValidator {

    public static void validateCreateOrUpdateApi(ApiRequestEntity apiRequestEntity){
        if (apiRequestEntity.getApiName() == null || StringUtils.isEmpty(apiRequestEntity.getApiName())){
            throw new RequestValidatorException("missing apiName");
        }
        if (Objects.isNull(apiRequestEntity.getApiUrl())){
            throw new RequestValidatorException("missing apiUrlEntity");
        }
        if (Objects.isNull(apiRequestEntity.getRequestMethod())){
            throw new RequestValidatorException("missing requestMethod");
        }
        if (Objects.isNull(apiRequestEntity.getApiParam())){
            throw new RequestValidatorException("missing ApiParam");
        }
        if (apiRequestEntity.getApiParam().getParamType()!= ParamType.NO_PARAM &&
                (apiRequestEntity.getApiParam().getParamBody()==null ||
                        StringUtils.isEmpty(apiRequestEntity.getApiParam().getParamBody()))){
            throw new RequestValidatorException("missing ParamBody");
        }
        if (Objects.isNull(apiRequestEntity.getApiHeader())){
            throw new RequestValidatorException("missing ApiHeader");
        }
        if (apiRequestEntity.getApiHeader().getHeaderType()!= HeaderType.NO_HEADER &&
                (apiRequestEntity.getApiHeader().getHeaderBody()==null ||
                        StringUtils.isEmpty(apiRequestEntity.getApiHeader().getHeaderBody()))){
            throw new RequestValidatorException("missing HeaderBody");
        }

    }
}
