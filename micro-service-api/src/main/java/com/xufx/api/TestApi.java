package com.xufx.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface TestApi {
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    String say(@RequestParam("") String value);

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    String test1(@RequestParam("") String value);

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    String test2(@RequestParam(required = false, value = "backendUserId") String value);
}