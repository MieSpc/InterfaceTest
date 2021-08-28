package com.auto.test.mapper;

import com.auto.test.domain.ApiUrl;

public interface ApiUrlMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApiUrl record);

    int insertSelective(ApiUrl record);

    ApiUrl selectByPrimaryKey(Long id);

    ApiUrl selectByApiBaseId(Long apiBaseId);

    ApiUrl selectByApiPath(String apiPath);

    int updateByApiBaseIdSelective(ApiUrl record);

    int updateByPrimaryKey(ApiUrl record);
}