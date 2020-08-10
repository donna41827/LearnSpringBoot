package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.HelloService02;

@Configuration//指定這是一個配置類
public class MyAppConfig {
	//將方法添加到容器中，取代原本舊有的<bean></bean>寫法，使用配置類是SpringBoot推薦的作法
	@Bean
	public HelloService02 helloBean() 
	{
		return new HelloService02();
	}
}
