package com.xufx.controller;

import com.xufx.api.TestApi;
import com.xufx.config.Girl;
import com.xufx.entity.test.Module;
import com.xufx.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class HelloController implements TestApi {
    @Value("${name}")
    private String name;
    @Autowired
    private Girl girl;
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @Override
    public String say(){
        //return name+": hello";
        //int i=5/0;
        return girl.getName();
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @Override
    public String test1(){
        //return name+": hello";
        Module module=testService.getModuleById(1);
        return girl.getName();
    }

    @Override
    public String test2(String value) {
        return value;
    }
}

