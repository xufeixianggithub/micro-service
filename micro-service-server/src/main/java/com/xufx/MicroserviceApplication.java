package com.xufx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xufx.mapper")
@EnableEurekaClient
public class MicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}

}
