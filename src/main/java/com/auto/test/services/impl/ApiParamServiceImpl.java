package com.auto.test.services.impl;

import com.auto.test.domain.ApiParam;
import com.auto.test.mapper.ApiParamMapper;
import com.auto.test.services.ApiParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiParamServiceImpl implements ApiParamService {

    @Autowired
    private ApiParamMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ApiParam record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(ApiParam record) {
        return mapper.insertSelective(record);
    }

    @Override
    public ApiParam selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ApiParam record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(ApiParam record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApiParam record) {
        return mapper.updateByPrimaryKey(record);
    }
}
