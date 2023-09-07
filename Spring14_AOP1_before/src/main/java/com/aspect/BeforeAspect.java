package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// target인 UserService의 sayEcho() 메서드 호출 시 위빙되는 aspect객체

@Aspect
public class BeforeAspect {

	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	@Before("xxx()")       // method2()가 먼저 실행된 후 -> xxx() 실행된다.
	public void method2() {
		System.out.println("BeforeAspect.method2");
	}
	
	// advice + pointcut 같이 표현
	@Before("execution(* callEcho(..))")       
	public void method3() {
		System.out.println("BeforeAspect.method3");
	}
	
	
}


