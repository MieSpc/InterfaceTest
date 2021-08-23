package com.auto.test.convert;

import com.auto.test.domain.ApiBase;
import com.auto.test.domain.ApiHeader;
import com.auto.test.domain.ApiParam;
import com.auto.test.domain.ApiUrl;
import com.auto.test.entity.ApiRequestEntity;

import java.util.Date;

public class ApiConvert {

    public static ApiBase apiConvertBase(ApiRequestEntity apiRequestEntity){
        ApiBase base = new ApiBase();
        if (apiRequestEntity.getId()!=null){
            base.setId(apiRequestEntity.getId());
        }
        base.setApiName(apiRequestEntity.getApiName());
        base.setRequestMethod(apiRequestEntity.getRequestMethod());
        base.setCreateUser(0L);
        base.setUpdateUser(0L);
        base.setCreateTime(new Date());
        return base;
    }

    public static ApiHeader apiConvertHeader(Long baseId, ApiRequestEntity apiRequestEntity){
        ApiHeader header = new ApiHeader();
        if (apiRequestEntity.getApiHeader().getId()!=null){
            header.setId(apiRequestEntity.getApiHeader().getId());
        }
        header.setHeaderBody(apiRequestEntity.getApiHeader().getHeaderBody());
        header.setApiBaseId(baseId);
        header.setCreateUser(0L);
        header.setUpdateUser(0L);
        header.setCreateTime(new Date());
        return header;
    }

    public static ApiParam apiConvertParam(Long baseId, ApiRequestEntity apiRequestEntity){
        ApiParam param = new ApiParam();
        if (apiRequestEntity.getApiParam().getId()!=null){
            param.setId(apiRequestEntity.getApiParam().getId());
        }
        param.setApiBaseId(baseId);
        param.setParamBody(apiRequestEntity.getApiParam().getParamBody());
        param.setCreateUser(0L);
        param.setUpdateUser(0L);
        param.setCreateTime(new Date());
        return param;
    }

    public static ApiUrl apiConvertUrl(Long baseId, ApiRequestEntity apiRequestEntity){
        ApiUrl url = new ApiUrl();
        if (apiRequestEntity.getApiUrl().getId()!=null){
            url.setId(apiRequestEntity.getApiUrl().getId());
        }
        url.setApiBaseId(baseId);
        url.setDomainName(apiRequestEntity.getApiUrl().getDomainName());
        url.setAgreement(apiRequestEntity.getApiUrl().getAgreementType());
        url.setPort(apiRequestEntity.getApiUrl().getPort());
        url.setCreateUser(0L);
        url.setUpdateUser(0L);
        url.setCreateTime(new Date());
        return url;
    }
}
