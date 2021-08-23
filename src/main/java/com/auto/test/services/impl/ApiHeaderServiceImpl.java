package com.auto.test.services.impl;

import com.auto.test.domain.ApiHeader;
import com.auto.test.mapper.ApiHeaderMapper;
import com.auto.test.services.ApiHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiHeaderServiceImpl implements ApiHeaderService {

    @Autowired
    private ApiHeaderMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ApiHeader record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(ApiHeader record) {
        return mapper.insertSelective(record);
    }

    @Override
    public ApiHeader selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ApiHeader record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(ApiHeader record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApiHeader record) {
        return mapper.updateByPrimaryKey(record);
    }
}
