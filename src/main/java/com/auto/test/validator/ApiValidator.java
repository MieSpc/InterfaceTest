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
            throw new RequestValidatorException("missing apiName","请检查接口名称字段！");
        }
        if (Objects.isNull(apiRequestEntity.getApiUrlEntity())){
            throw new RequestValidatorException("missing apiUrlEntity","请检查接口url是否完整！");
        }
        if (Objects.isNull(apiRequestEntity.getRequestMethod())){
            throw new RequestValidatorException("missing requestMethod","请检查是否填写接口请求方法");
        }
        if (Objects.isNull(apiRequestEntity.getParamType())){
            throw new RequestValidatorException("missing ParamType","请检查是否填写参数类型");
        }
        if (apiRequestEntity.getParamType()!= ParamType.NO_PARAM &&
                (apiRequestEntity.getParamBody()==null || StringUtils.isEmpty(apiRequestEntity.getParamBody()))){
            throw new RequestValidatorException("missing ParamBody","请检查是否填写参数正文！");
        }
        if (Objects.isNull(apiRequestEntity.getHeaderType())){
            throw new RequestValidatorException("missing HeaderType","请检查是否填写请求头类型");
        }
        if (apiRequestEntity.getHeaderType()!= HeaderType.NO_HEADER &&
                (apiRequestEntity.getHeaderBody()==null || StringUtils.isEmpty(apiRequestEntity.getHeaderBody()))){
            throw new RequestValidatorException("missing HeaderBody","请检查是否填写header！");
        }

    }
}
