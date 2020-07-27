package com.wzx.example.springcloudeureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEureka01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEureka01Application.class, args);
	}

}
