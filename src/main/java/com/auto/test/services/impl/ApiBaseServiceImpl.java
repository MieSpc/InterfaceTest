package com.auto.test.services.impl;

import com.auto.test.domain.ApiBase;
import com.auto.test.mapper.ApiBaseMapper;
import com.auto.test.services.ApiBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiBaseServiceImpl implements ApiBaseService {

    @Autowired
    private ApiBaseMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(ApiBase record) {
        mapper.insert(record);
    }

    @Override
    public int insertSelective(ApiBase record) {
        return mapper.insertSelective(record);
    }

    @Override
    public ApiBase selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ApiBase record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApiBase record) {
        return mapper.updateByPrimaryKey(record);
    }
}
