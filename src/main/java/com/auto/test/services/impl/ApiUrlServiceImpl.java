package com.auto.test.services.impl;

import com.auto.test.domain.ApiUrl;
import com.auto.test.mapper.ApiUrlMapper;
import com.auto.test.services.ApiUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiUrlServiceImpl implements ApiUrlService {

    @Autowired
    private ApiUrlMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ApiUrl record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(ApiUrl record) {
        return mapper.insertSelective(record);
    }

    @Override
    public ApiUrl selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public ApiUrl selectByApiBaseId(Long id) {
        return mapper.selectByApiBaseId(id);
    }

    @Override
    public ApiUrl selectByApiPath(String url) {
        return mapper.selectByApiPath(url);
    }

    @Override
    public int updateByPrimaryKeySelective(ApiUrl record) {
        return mapper.updateByApiBaseIdSelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApiUrl record) {
        return mapper.updateByPrimaryKey(record);
    }
}
