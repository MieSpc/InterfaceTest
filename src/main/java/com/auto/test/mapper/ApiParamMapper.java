package com.auto.test.mapper;

import com.auto.test.domain.ApiParam;

public interface ApiParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApiParam record);

    int insertSelective(ApiParam record);

    ApiParam selectByPrimaryKey(Long id);

    ApiParam selectByApiBaseId(Long apiBaseId);

    int updateByApiBaseIdSelective(ApiParam record);

    int updateByPrimaryKeyWithBLOBs(ApiParam record);

    int updateByPrimaryKey(ApiParam record);
}