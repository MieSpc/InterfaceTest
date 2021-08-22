package com.auto.test.services.impl;

import com.auto.test.domain.InterfaceHeader;
import com.auto.test.mapper.InterfaceHeaderMapper;
import com.auto.test.services.InterfaceHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterfaceHeaderServiceImpl implements InterfaceHeaderService {

    @Autowired
    private InterfaceHeaderMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(InterfaceHeader record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(InterfaceHeader record) {
        return mapper.insertSelective(record);
    }

    @Override
    public InterfaceHeader selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(InterfaceHeader record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(InterfaceHeader record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(InterfaceHeader record) {
        return mapper.updateByPrimaryKey(record);
    }
}
