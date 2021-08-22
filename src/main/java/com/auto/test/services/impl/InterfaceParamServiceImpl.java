package com.auto.test.services.impl;

import com.auto.test.domain.InterfaceParam;
import com.auto.test.mapper.InterfaceParamMapper;
import com.auto.test.services.InterfaceParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterfaceParamServiceImpl implements InterfaceParamService {

    @Autowired
    private InterfaceParamMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(InterfaceParam record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(InterfaceParam record) {
        return mapper.insertSelective(record);
    }

    @Override
    public InterfaceParam selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(InterfaceParam record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(InterfaceParam record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(InterfaceParam record) {
        return mapper.updateByPrimaryKey(record);
    }
}
