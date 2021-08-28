package com.auto.test.services;

import com.auto.test.domain.ApiUrl;

public interface ApiUrlService {
    int deleteByPrimaryKey(Long id);

    int insert(ApiUrl record);

    int insertSelective(ApiUrl record);

    ApiUrl selectByPrimaryKey(Long id);

    ApiUrl selectByApiBaseId(Long id);

    ApiUrl selectByApiPath(String url);

    int updateByPrimaryKeySelective(ApiUrl record);

    int updateByPrimaryKey(ApiUrl record);
}
