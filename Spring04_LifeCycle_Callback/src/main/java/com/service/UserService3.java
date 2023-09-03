package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserService3 {

	//기본생성자
	public UserService3() {
		System.out.println("UserService3 생성자");
	}

	@PostConstruct
	public void xxx() {
		System.out.println("@PostConstruct. xxx");
	}

	@PreDestroy
	public void yyy() {
		System.out.println("@PreDestroy. yyy");
	}

	
	
	
}
