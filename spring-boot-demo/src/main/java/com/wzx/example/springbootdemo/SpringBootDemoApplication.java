package com.wzx.example.springbootdemo;

import com.wzx.example.springbootdemo.demo2.RedisTemplate;
import com.wzx.example.springbootdemo.demo3.EnableConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfiguration
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca = SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println(ca.getBean(RedisTemplate.class));
	}

}
