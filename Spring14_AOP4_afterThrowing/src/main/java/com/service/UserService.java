package com.service;

// target 객체 : 핵심 기능 구현 빈
public class UserService {

	//핵심처리 메서드 => 주입받는 메서드
	public String sayEcho() {
		System.out.println("sayEcho");
		int n = 0;    //일부러 예외발생
		System.out.println(10/n);
		return "hello";
	}
	
	// 그 외의 메서드 => 주입 x
	public String callEcho() {
		System.out.println("callEcho");
		return "world";
	}
}
