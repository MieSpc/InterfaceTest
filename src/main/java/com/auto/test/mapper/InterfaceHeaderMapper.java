package com.auto.test.mapper;

import com.auto.test.domain.InterfaceHeader;

public interface InterfaceHeaderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InterfaceHeader record);

    int insertSelective(InterfaceHeader record);

    InterfaceHeader selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InterfaceHeader record);

    int updateByPrimaryKeyWithBLOBs(InterfaceHeader record);

    int updateByPrimaryKey(InterfaceHeader record);
}