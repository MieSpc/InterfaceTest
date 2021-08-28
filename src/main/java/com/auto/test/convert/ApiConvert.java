package com.auto.test.convert;

import com.auto.test.domain.ApiBase;
import com.auto.test.domain.ApiHeader;
import com.auto.test.domain.ApiParam;
import com.auto.test.domain.ApiUrl;
import com.auto.test.entity.ApiDetailResponse;
import com.auto.test.entity.ApiSaveRequest;
import com.auto.test.entity.ApiSaveRequest.ApiHeaderEntity;
import com.auto.test.entity.ApiSaveRequest.ApiParamEntity;
import com.auto.test.entity.ApiSaveRequest.ApiUrlEntity;

import java.util.Date;
import java.util.Objects;

public class ApiConvert {

    public static ApiBase apiConvertBase(ApiSaveRequest apiSaveRequest){
        ApiBase base = new ApiBase();
        if (apiSaveRequest.getId()!=null){
            base.setId(apiSaveRequest.getId());
        }
        base.setApiName(apiSaveRequest.getApiName());
        base.setRequestMethod(apiSaveRequest.getRequestMethod());
        base.setCreateUser(0L);
        base.setUpdateUser(0L);
        base.setCreateTime(new Date());
        return base;
    }

    public static ApiHeader apiConvertHeader(Long baseId, ApiSaveRequest apiSaveRequest){
        ApiHeader header = new ApiHeader();
        if (apiSaveRequest.getApiHeader().getId()!=null){
            header.setId(apiSaveRequest.getApiHeader().getId());
        }
        header.setHeaderBody(apiSaveRequest.getApiHeader().getHeaderBody());
        header.setApiBaseId(baseId);
        header.setCreateUser(0L);
        header.setUpdateUser(0L);
        header.setCreateTime(new Date());
        return header;
    }

    public static ApiParam apiConvertParam(Long baseId, ApiSaveRequest apiSaveRequest){
        ApiParam param = new ApiParam();
        if (apiSaveRequest.getApiParam().getId()!=null){
            param.setId(apiSaveRequest.getApiParam().getId());
        }
        param.setApiBaseId(baseId);
        param.setParamBody(apiSaveRequest.getApiParam().getParamBody());
        param.setCreateUser(0L);
        param.setUpdateUser(0L);
        param.setCreateTime(new Date());
        return param;
    }

    public static ApiUrl apiConvertUrl(Long baseId, ApiSaveRequest apiSaveRequest){
        ApiUrl url = new ApiUrl();
        if (apiSaveRequest.getApiUrl().getId()!=null){
            url.setId(apiSaveRequest.getApiUrl().getId());
        }
        url.setApiBaseId(baseId);
        url.setDomainName(apiSaveRequest.getApiUrl().getDomainName());
        url.setAgreement(apiSaveRequest.getApiUrl().getAgreementType());
        url.setPort(apiSaveRequest.getApiUrl().getPort());
        url.setApiPath(apiSaveRequest.getApiUrl().getApiPath());
        url.setCreateUser(0L);
        url.setUpdateUser(0L);
        url.setCreateTime(new Date());
        return url;
    }

    public static ApiDetailResponse convertApiDetail(ApiBase apiBase,ApiHeader header,ApiParam param,ApiUrl url){
        ApiDetailResponse response = new ApiDetailResponse();
        response.setId(apiBase.getId());
        response.setApiName(apiBase.getApiName());
        response.setRequestMethod(apiBase.getRequestMethod());

        ApiParamEntity apiParam = new ApiParamEntity();
        apiParam.setId(param.getId());
        apiParam.setParamType(param.getParamType());
        if (Objects.nonNull(param.getParamBody())){
            apiParam.setParamBody(param.getParamBody());
        }
        response.setApiParam(apiParam);

        ApiHeaderEntity apiHeader = new ApiHeaderEntity();
        apiHeader.setId(header.getId());
        apiHeader.setHeaderType(header.getHeaderType());
        if (Objects.nonNull(header.getHeaderBody())){
            apiHeader.setHeaderBody(header.getHeaderBody());
        }
        response.setApiHeader(apiHeader);

        ApiUrlEntity apiUrl = new ApiUrlEntity();
        apiUrl.setId(url.getId());
        apiUrl.setAgreementType(url.getAgreement());
        apiUrl.setDomainName(url.getDomainName());
        apiUrl.setPort(url.getPort());
        apiUrl.setApiPath(url.getApiPath());
        response.setApiUrl(apiUrl);

        return response;
    }
}
