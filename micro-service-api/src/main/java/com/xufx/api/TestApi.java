package com.xufx.api;


import com.xufx.Fallback.TestServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "micro-service", fallbackFactory = TestServiceFallback.class)
public interface TestApi{
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    String say();

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    String test1();

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    String test2(@RequestParam(required = false, value = "backendUserId") String value);
}

