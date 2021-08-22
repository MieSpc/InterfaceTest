package com.auto.test.services.impl;

import com.auto.test.domain.InterfaceBase;
import com.auto.test.mapper.InterfaceBaseMapper;
import com.auto.test.services.InterfaceBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterfaceBaseServiceImpl implements InterfaceBaseService {

    @Autowired
    private InterfaceBaseMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(InterfaceBase record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(InterfaceBase record) {
        return mapper.insertSelective(record);
    }

    @Override
    public InterfaceBase selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(InterfaceBase record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(InterfaceBase record) {
        return mapper.updateByPrimaryKey(record);
    }
}
