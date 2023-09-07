package com.dto;

import org.springframework.beans.factory.annotation.Value;

public class Cat {

	String username;
	int age;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Cat [username=" + username + ", age=" + age + "]";
	}
	
}
