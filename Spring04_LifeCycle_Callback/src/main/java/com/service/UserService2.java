package com.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserService2 implements InitializingBean, DisposableBean {

	//기본생성자
	public UserService2() {
		System.out.println("UserService2 생성자");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("생성자 호출후 InitializingBean.afterPropertiesSet()");
	}
	
	
}
