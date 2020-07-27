package com.wzx.example.springcloudeureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEureka02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEureka02Application.class, args);
	}

}
