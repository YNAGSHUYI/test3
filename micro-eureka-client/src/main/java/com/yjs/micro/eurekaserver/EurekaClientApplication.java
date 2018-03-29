package com.yjs.micro.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication //spring-boot的启动
@EnableEurekaClient //声明这是一个注册的服务
public class EurekaClientApplication {
	public static void main(String[] args) {

		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
