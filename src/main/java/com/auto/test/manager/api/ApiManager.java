package com.auto.test.manager.api;

import com.auto.test.config.DataSourceInterfaceSvcConfig;
import com.auto.test.convert.ApiConvert;
import com.auto.test.domain.ApiBase;
import com.auto.test.domain.ApiHeader;
import com.auto.test.domain.ApiParam;
import com.auto.test.domain.ApiUrl;
import com.auto.test.entity.ApiDetailResponse;
import com.auto.test.entity.ApiSaveRequest;
import com.auto.test.entity.SimpleLongRequest;
import com.auto.test.enums.ApiErrorCode;
import com.auto.test.exceptions.CustomException;
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

    public Long saveOrUpdateApi(ApiSaveRequest apiSaveRequest){
        ApiUrl apiUrl = urlService.selectByApiPath(apiSaveRequest.getApiUrl().getApiPath());
        if (Objects.nonNull(apiUrl)){
            throw new CustomException(ApiErrorCode.API_EXIT);
        }
        if (Objects.nonNull(apiSaveRequest.getId())){
            return updateApi(apiSaveRequest);
        }
        return saveApi(apiSaveRequest);
    }

    @Transactional(value = DataSourceInterfaceSvcConfig.TX_MANAGER, rollbackFor = Exception.class)
    public Long saveApi(ApiSaveRequest apiSaveRequest){
        ApiBase base = ApiConvert.apiConvertBase(apiSaveRequest);
        baseService.insertSelective(base);
        ApiHeader header = ApiConvert.apiConvertHeader(base.getId(), apiSaveRequest);
        headerService.insertSelective(header);
        ApiParam param = ApiConvert.apiConvertParam(base.getId(), apiSaveRequest);
        paramService.insertSelective(param);
        ApiUrl url = ApiConvert.apiConvertUrl(base.getId(), apiSaveRequest);
        urlService.insertSelective(url);
        return base.getId();
    }

    @Transactional(value = DataSourceInterfaceSvcConfig.TX_MANAGER, rollbackFor = Exception.class)
    public Long updateApi(ApiSaveRequest apiSaveRequest){
        ApiBase base = ApiConvert.apiConvertBase(apiSaveRequest);
        baseService.updateByPrimaryKeySelective(base);
        ApiHeader header = ApiConvert.apiConvertHeader(base.getId(), apiSaveRequest);
        headerService.updateByPrimaryKeySelective(header);
        ApiParam param = ApiConvert.apiConvertParam(base.getId(), apiSaveRequest);
        paramService.updateByPrimaryKeySelective(param);
        ApiUrl url = ApiConvert.apiConvertUrl(base.getId(), apiSaveRequest);
        urlService.updateByPrimaryKeySelective(url);
        return base.getId();
    }

    public ApiDetailResponse apiDetail(SimpleLongRequest request){
        Long baseId = request.getData();
        ApiBase base = baseService.selectByPrimaryKey(baseId);
        if (Objects.isNull(base)){
            throw new CustomException(ApiErrorCode.API_NOT_FOUND);
        }
        ApiHeader header = headerService.selectByApiBaseId(baseId);
        ApiParam param = paramService.selectByApiBaseId(baseId);
        ApiUrl url = urlService.selectByApiBaseId(baseId);
        return ApiConvert.convertApiDetail(base,header,param,url);
    }

}
