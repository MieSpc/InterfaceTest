package com.auto.test.mapper;

import com.auto.test.domain.InterfaceBase;

public interface InterfaceBaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InterfaceBase record);

    int insertSelective(InterfaceBase record);

    InterfaceBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InterfaceBase record);

    int updateByPrimaryKey(InterfaceBase record);
}