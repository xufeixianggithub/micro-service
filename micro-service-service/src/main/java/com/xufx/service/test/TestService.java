package com.xufx.service.test;

import com.xufx.entity.test.Module;
import org.apache.ibatis.annotations.Param;

public interface TestService {
    Module getModuleById(Integer mid);
}
