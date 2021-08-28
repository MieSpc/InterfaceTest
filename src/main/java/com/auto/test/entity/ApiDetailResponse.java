package com.auto.test.entity;

import com.auto.test.entity.ApiSaveRequest.ApiHeaderEntity;
import com.auto.test.entity.ApiSaveRequest.ApiParamEntity;
import com.auto.test.entity.ApiSaveRequest.ApiUrlEntity;
import com.auto.test.enums.RequestMethod;

public class ApiDetailResponse {
    private Long id;
    private String apiName;
    private ApiUrlEntity apiUrl;
    private RequestMethod requestMethod;
    private ApiParamEntity apiParam;
    private ApiHeaderEntity apiHeader;

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

    public ApiUrlEntity getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(ApiUrlEntity apiUrl) {
        this.apiUrl = apiUrl;
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
    }

    public ApiParamEntity getApiParam() {
        return apiParam;
    }

    public void setApiParam(ApiParamEntity apiParam) {
        this.apiParam = apiParam;
    }

    public ApiHeaderEntity getApiHeader() {
        return apiHeader;
    }

    public void setApiHeader(ApiHeaderEntity apiHeader) {
        this.apiHeader = apiHeader;
    }
}
