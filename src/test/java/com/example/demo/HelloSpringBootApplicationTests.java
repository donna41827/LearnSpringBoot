package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Person;
import com.example.demo.bean.PersonUseValue;
/*
 * 這是SpringBoot的單元測試(@SpringBootTest)
*/
import com.example.demo.bean.psPerson;

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSpringBootApplicationTests {
	
	@Autowired//自動綁定
	Person person;
	
	@Autowired//自動綁定
	PersonUseValue person2;

	@Autowired//自動綁定
	psPerson person3;
	
	@Autowired//自動綁定
	ApplicationContext ioc;

	@Test
	void contextLoads() {
		System.out.println("使用@ConfigurationPropertie取值:"+person);
		System.out.println("使用@Value取值:"+person2);
		System.out.println("使用@PropertySource取特定配置文件值:"+person3);
		System.out.println("使用@ImportResource看是否成功載入HelloServiceBean?"+ioc.containsBean( "helloService" ));
		System.out.println("使用@Bean看是否成功載入helloBean(@BeanID綁定方法名稱)?"+ioc.containsBean( "helloBean" ));
	}

}
