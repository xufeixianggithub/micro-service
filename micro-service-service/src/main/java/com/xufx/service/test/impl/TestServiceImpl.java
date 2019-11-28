package com.xufx.service.test.impl;

import com.xufx.entity.test.Module;
import com.xufx.mapper.test.ModuleMapper;
import com.xufx.service.test.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService{
    @Resource
    private ModuleMapper moduleMapper;
    @Override
    public Module getModuleById(Integer id) {
        return moduleMapper.selectById(id);
    }
}
