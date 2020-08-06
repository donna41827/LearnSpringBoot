package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//告訴Spring這是Controller
public class HelloController {
	
	@Value("${person.lastName}")
	private String name;
	
	@ResponseBody//將結果回傳給HTML
	@RequestMapping("/hello")//呼叫的URL
	public String hello() {
		return "Hello World!" + name;
	}
}
