package com.auto.test.mapper;

import com.auto.test.domain.InterfaceUrl;

public interface InterfaceUrlMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InterfaceUrl record);

    int insertSelective(InterfaceUrl record);

    InterfaceUrl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InterfaceUrl record);

    int updateByPrimaryKey(InterfaceUrl record);
}