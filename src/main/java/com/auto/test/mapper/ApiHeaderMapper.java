package com.auto.test.mapper;

import com.auto.test.domain.ApiHeader;

public interface ApiHeaderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApiHeader record);

    int insertSelective(ApiHeader record);

    ApiHeader selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApiHeader record);

    int updateByPrimaryKeyWithBLOBs(ApiHeader record);

    int updateByPrimaryKey(ApiHeader record);
}