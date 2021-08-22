package com.auto.test.manager;

import com.auto.test.config.DataSourceInterfaceSvcConfig;
import com.auto.test.convert.ApiConvert;
import com.auto.test.domain.InterfaceBase;
import com.auto.test.domain.InterfaceHeader;
import com.auto.test.domain.InterfaceParam;
import com.auto.test.domain.InterfaceUrl;
import com.auto.test.entity.ApiRequestEntity;
import com.auto.test.enums.HeaderType;
import com.auto.test.enums.ParamType;
import com.auto.test.services.InterfaceBaseService;
import com.auto.test.services.InterfaceHeaderService;
import com.auto.test.services.InterfaceParamService;
import com.auto.test.services.InterfaceUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Component
public class ApiManager {

    @Autowired
    private InterfaceBaseService baseService;

    @Autowired
    private InterfaceHeaderService headerService;

    @Autowired
    private InterfaceParamService paramService;

    @Autowired
    private InterfaceUrlService urlService;

    public Long saveOrUpdateApi(ApiRequestEntity apiRequestEntity){
        if (Objects.nonNull(apiRequestEntity.getId())){
            //todo 根据id更新表记录
        }
        return saveApi(apiRequestEntity);
    }

    @Transactional(value = DataSourceInterfaceSvcConfig.TX_MANAGER, rollbackFor = Exception.class)
    public Long saveApi(ApiRequestEntity apiRequestEntity){
        InterfaceBase base = ApiConvert.apiConvertBase(apiRequestEntity);
        baseService.insert(base);
        if (apiRequestEntity.getHeaderType()== HeaderType.HAS_HEADER){
            InterfaceHeader header = ApiConvert.apiConvertHeader(base.getId(),apiRequestEntity);
            headerService.insert(header);
        }
        if (apiRequestEntity.getParamType() != ParamType.NO_PARAM){
            InterfaceParam param = ApiConvert.apiConvertParam(base.getId(),apiRequestEntity);
            paramService.insert(param);
        }
        InterfaceUrl url = ApiConvert.apiConvertUrl(base.getId(),apiRequestEntity);
        urlService.insert(url);
        return base.getId();
    }

    public void updateApi(){

    }

}
