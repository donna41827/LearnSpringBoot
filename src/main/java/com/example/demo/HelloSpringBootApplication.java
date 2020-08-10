package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations={"classpath:beans.xml"})
@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		//啟動Spring應用
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

}
