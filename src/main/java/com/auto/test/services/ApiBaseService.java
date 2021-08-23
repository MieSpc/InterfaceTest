package com.auto.test.services;

import com.auto.test.domain.ApiBase;

public interface ApiBaseService {
    int deleteByPrimaryKey(Long id);

    void insert(ApiBase record);

    int insertSelective(ApiBase record);

    ApiBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApiBase record);

    int updateByPrimaryKey(ApiBase record);
}
