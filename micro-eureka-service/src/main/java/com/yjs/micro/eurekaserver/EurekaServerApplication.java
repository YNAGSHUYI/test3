package com.yjs.micro.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication //spring-boot的启动
@EnableEurekaServer //声明这是一个注册的服务
public class EurekaServerApplication {
	public static void main(String[] args) {

		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
