package com.auto.test.manager.api;

import com.auto.test.config.DataSourceInterfaceSvcConfig;
import com.auto.test.convert.ApiConvert;
import com.auto.test.domain.ApiBase;
import com.auto.test.domain.ApiHeader;
import com.auto.test.domain.ApiParam;
import com.auto.test.domain.ApiUrl;
import com.auto.test.entity.ApiRequestEntity;
import com.auto.test.enums.HeaderType;
import com.auto.test.enums.ParamType;
import com.auto.test.services.ApiBaseService;
import com.auto.test.services.ApiHeaderService;
import com.auto.test.services.ApiParamService;
import com.auto.test.services.ApiUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Component
public class ApiManager {

    @Autowired
    private ApiBaseService baseService;

    @Autowired
    private ApiHeaderService headerService;

    @Autowired
    private ApiParamService paramService;

    @Autowired
    private ApiUrlService urlService;

    public Long saveOrUpdateApi(ApiRequestEntity apiRequestEntity){
        if (Objects.nonNull(apiRequestEntity.getId())){
            //todo 根据id更新表记录
        }
        return saveApi(apiRequestEntity);
    }

    @Transactional(value = DataSourceInterfaceSvcConfig.TX_MANAGER, rollbackFor = Exception.class)
    public Long saveApi(ApiRequestEntity apiRequestEntity){
        ApiBase base = ApiConvert.apiConvertBase(apiRequestEntity);
        baseService.insertSelective(base);
        if (apiRequestEntity.getApiHeader().getHeaderType()== HeaderType.HAS_HEADER){
            ApiHeader header = ApiConvert.apiConvertHeader(base.getId(),apiRequestEntity);
            headerService.insertSelective(header);
        }
        if (apiRequestEntity.getApiParam().getParamType() != ParamType.NO_PARAM){
            ApiParam param = ApiConvert.apiConvertParam(base.getId(),apiRequestEntity);
            paramService.insertSelective(param);
        }
        ApiUrl url = ApiConvert.apiConvertUrl(base.getId(),apiRequestEntity);
        urlService.insertSelective(url);
        return base.getId();
    }

    public void updateApi(){

    }

}
