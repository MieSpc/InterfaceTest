package com.auto.test.services;

import com.auto.test.domain.ApiHeader;

public interface ApiHeaderService {

    int deleteByPrimaryKey(Long id);

    int insert(ApiHeader record);

    int insertSelective(ApiHeader record);

    ApiHeader selectByPrimaryKey(Long id);

    ApiHeader selectByApiBaseId(Long id);

    int updateByPrimaryKeySelective(ApiHeader record);

    int updateByPrimaryKeyWithBLOBs(ApiHeader record);

    int updateByPrimaryKey(ApiHeader record);
}
