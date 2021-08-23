package com.auto.test.mapper;

import com.auto.test.domain.ApiBase;

public interface ApiBaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApiBase record);

    int insertSelective(ApiBase record);

    ApiBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApiBase record);

    int updateByPrimaryKey(ApiBase record);
}