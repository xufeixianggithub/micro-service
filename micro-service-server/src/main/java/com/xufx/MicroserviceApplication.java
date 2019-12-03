package com.xufx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(basePackages = "com.xufx.mapper")
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class MicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}

}
