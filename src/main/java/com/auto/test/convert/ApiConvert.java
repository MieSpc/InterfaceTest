package com.auto.test.convert;

import com.auto.test.domain.InterfaceBase;
import com.auto.test.domain.InterfaceHeader;
import com.auto.test.domain.InterfaceParam;
import com.auto.test.domain.InterfaceUrl;
import com.auto.test.entity.ApiRequestEntity;

import java.util.Date;

public class ApiConvert {

    public static InterfaceBase apiConvertBase(ApiRequestEntity apiRequestEntity){
        InterfaceBase base = new InterfaceBase();
        if (apiRequestEntity.getId()!=null){
            base.setId(apiRequestEntity.getId());
        }
        base.setApiName(apiRequestEntity.getApiName());
        base.setParamType(apiRequestEntity.getParamType());
        base.setRequestMethod(apiRequestEntity.getRequestMethod());
        base.setHeaderType(apiRequestEntity.getHeaderType());
        base.setCreateUser(0L);
        base.setUpdateUser(0L);
        base.setCreateTime(new Date());
        return base;
    }

    public static InterfaceHeader apiConvertHeader(Long baseId,ApiRequestEntity apiRequestEntity){
        InterfaceHeader header = new InterfaceHeader();
        header.setHeaderBody(apiRequestEntity.getHeaderBody());
        header.setInterfaceBaseId(baseId);
        header.setCreateUser(0L);
        header.setUpdateUser(0L);
        header.setCreateTime(new Date());
        return header;
    }

    public static InterfaceParam apiConvertParam(Long baseId,ApiRequestEntity apiRequestEntity){
        InterfaceParam param = new InterfaceParam();
        param.setInterfaceBaseId(baseId);
        param.setParamBody(apiRequestEntity.getParamBody());
        param.setCreateUser(0L);
        param.setUpdateUser(0L);
        param.setCreateTime(new Date());
        return param;
    }

    public static InterfaceUrl apiConvertUrl(Long baseId,ApiRequestEntity apiRequestEntity){
        InterfaceUrl url = new InterfaceUrl();
        url.setInterfaceBaseId(baseId);
        url.setDomainName(apiRequestEntity.getApiUrlEntity().getDomainName());
        url.setAgreement(apiRequestEntity.getApiUrlEntity().getAgreementType());
        url.setPort(apiRequestEntity.getApiUrlEntity().getPort());
        url.setCreateUser(0L);
        url.setUpdateUser(0L);
        url.setCreateTime(new Date());
        return url;
    }
}
