package com.wzx.example.ribbonuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wzx.example")
@SpringBootApplication
public class RibbonUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonUserApplication.class, args);
	}

}
