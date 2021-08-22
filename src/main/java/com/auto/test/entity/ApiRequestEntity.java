package com.auto.test.entity;

import com.auto.test.enums.HeaderType;
import com.auto.test.enums.ParamType;
import com.auto.test.enums.RequestMethod;

/**
 * 保存接口请求实体类
 */
public class ApiRequestEntity {
    private Long id;

    private String apiName;

    private ApiUrlEntity apiUrlEntity;

    private RequestMethod requestMethod;

    private ParamType paramType;

    private HeaderType headerType;

    private String paramBody;

    private String headerBody;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public ApiUrlEntity getApiUrlEntity() {
        return apiUrlEntity;
    }

    public void setApiUrlEntity(ApiUrlEntity apiUrlEntity) {
        this.apiUrlEntity = apiUrlEntity;
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
    }

    public ParamType getParamType() {
        return paramType;
    }

    public void setParamType(ParamType paramType) {
        this.paramType = paramType;
    }

    public HeaderType getHeaderType() {
        return headerType;
    }

    public void setHeaderType(HeaderType headerType) {
        this.headerType = headerType;
    }

    public String getParamBody() {
        return paramBody;
    }

    public void setParamBody(String paramBody) {
        this.paramBody = paramBody;
    }

    public String getHeaderBody() {
        return headerBody;
    }

    public void setHeaderBody(String headerBody) {
        this.headerBody = headerBody;
    }

    @Override
    public String toString() {
        return "ApiRequestEntity{" +
                "id=" + id +
                ", apiName='" + apiName + '\'' +
                ", apiUrlEntity=" + apiUrlEntity +
                ", requestMethod=" + requestMethod +
                ", paramType=" + paramType +
                ", headerType=" + headerType +
                ", paramBody='" + paramBody + '\'' +
                ", headerBody='" + headerBody + '\'' +
                '}';
    }
}
