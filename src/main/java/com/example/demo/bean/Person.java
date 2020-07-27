package com.example.demo.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties告訴SpringBoot，本類的所有屬性都是配置文件的屬性
//prefix抓取配置文件中哪個屬性進行Mapping
//@Component-必須為容器中的組件才能使用容器的功能
@Component
@ConfigurationProperties(prefix="person")
public class Person {
	private String lastName;
	private Integer age;
	private Boolean boss;
	private Date birth;
	private Map<String,Object> maps;
	private List<Object> lists;
	private Dog dog;
	
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps="
				+ maps + ", lists=" + lists + ", dog=" + dog + "]";
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
}
