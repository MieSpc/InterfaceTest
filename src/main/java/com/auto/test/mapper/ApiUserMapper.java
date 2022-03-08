package com.auto.test.mapper;

import com.auto.test.domain.ApiUser;

public interface ApiUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApiUser record);

    int insertSelective(ApiUser record);

    ApiUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApiUser record);

    int updateByPrimaryKey(ApiUser record);
}