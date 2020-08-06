package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Person;
import com.example.demo.bean.PersonUseValue;
/*
 * 這是SpringBoot的單元測試(@SpringBootTest)
*/

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSpringBootApplicationTests {
	
	@Autowired//自動綁定
	Person person;
	@Autowired//自動綁定
	PersonUseValue person2;

	@Test
	void contextLoads() {
		System.out.println("使用@ConfigurationPropertie取值:"+person);
		System.out.println("使用@Value取值:"+person2);
	}

}
