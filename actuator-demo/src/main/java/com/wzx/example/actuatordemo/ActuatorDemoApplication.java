package com.wzx.example.actuatordemo;

import com.sun.deploy.net.HttpResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorDemoApplication.class, args);
	}

	@GetMapping("/test")
	public String test(){

		return "hello";
	}

}
