package com.auto.test.services;

import com.auto.test.domain.InterfaceParam;

public interface InterfaceParamService {

    int deleteByPrimaryKey(Long id);

    int insert(InterfaceParam record);

    int insertSelective(InterfaceParam record);

    InterfaceParam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InterfaceParam record);

    int updateByPrimaryKeyWithBLOBs(InterfaceParam record);

    int updateByPrimaryKey(InterfaceParam record);
}
