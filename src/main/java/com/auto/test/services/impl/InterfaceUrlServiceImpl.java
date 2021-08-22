package com.auto.test.services.impl;

import com.auto.test.domain.InterfaceUrl;
import com.auto.test.mapper.InterfaceUrlMapper;
import com.auto.test.services.InterfaceUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterfaceUrlServiceImpl implements InterfaceUrlService {

    @Autowired
    private InterfaceUrlMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(InterfaceUrl record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(InterfaceUrl record) {
        return mapper.insertSelective(record);
    }

    @Override
    public InterfaceUrl selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(InterfaceUrl record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(InterfaceUrl record) {
        return mapper.updateByPrimaryKey(record);
    }
}
