package com.auto.test.services;

import com.auto.test.domain.ApiParam;

public interface ApiParamService {

    int deleteByPrimaryKey(Long id);

    int insert(ApiParam record);

    int insertSelective(ApiParam record);

    ApiParam selectByPrimaryKey(Long id);

    ApiParam selectByApiBaseId(Long id);

    int updateByPrimaryKeySelective(ApiParam record);

    int updateByPrimaryKeyWithBLOBs(ApiParam record);

    int updateByPrimaryKey(ApiParam record);
}
