package com.xufx.mapper.test;

import com.xufx.entity.test.Module;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.IdsMapper;

public interface ModuleMapper extends BaseMapper<Module>{

    Module selectById(@Param("mid") Integer mid);
}