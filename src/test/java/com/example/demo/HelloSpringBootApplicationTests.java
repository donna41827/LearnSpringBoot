package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Person;
/*
 * 這是SpringBoot的單元測試(@SpringBootTest)
*/

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSpringBootApplicationTests {
	
	@Autowired
	Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
