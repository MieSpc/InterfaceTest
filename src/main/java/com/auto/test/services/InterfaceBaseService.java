package com.auto.test.services;

import com.auto.test.domain.InterfaceBase;

public interface InterfaceBaseService {
    int deleteByPrimaryKey(Long id);

    void insert(InterfaceBase record);

    int insertSelective(InterfaceBase record);

    InterfaceBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InterfaceBase record);

    int updateByPrimaryKey(InterfaceBase record);
}
