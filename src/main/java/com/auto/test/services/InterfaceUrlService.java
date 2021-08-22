package com.auto.test.services;

import com.auto.test.domain.InterfaceUrl;

public interface InterfaceUrlService {
    int deleteByPrimaryKey(Long id);

    int insert(InterfaceUrl record);

    int insertSelective(InterfaceUrl record);

    InterfaceUrl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InterfaceUrl record);

    int updateByPrimaryKey(InterfaceUrl record);
}
