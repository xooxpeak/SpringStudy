package com.service;

public class UserService {

	//기본생성자
	public UserService() {
		System.out.println("UserService 생성자");
	}
	
	//init-method="xxx"  리턴타입 void 파라미터 없어야됨
	//생성자 호출 이후에 작업을 하고싶으면 아래에 하면 됨
	public void xxx() {
		System.out.println("생성자 호출후 xxx 호출");
	}
	
	
	//destroy-method="yyy"
	public void yyy() {
		System.out.println("yyy 호출");
	}

}
