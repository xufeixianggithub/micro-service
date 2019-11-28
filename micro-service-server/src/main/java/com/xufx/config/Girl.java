package com.xufx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="girl")
public class Girl {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Girl setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Girl setAge(Integer age) {
        this.age = age;
        return this;
    }
}
