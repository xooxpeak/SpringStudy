package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// target인 UserService의 sayEcho() 메서드 호출 시 위빙되는 aspect객체

@Aspect
public class AfterAspect {

	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	@After("xxx()")       // sayEcho() 호출 후에 실행됨
	public void method2() {
		System.out.println("AfterAspect.method2");
	}
	
	// advice + pointcut 같이 표현
	@After("execution(* callEcho(..))")    // callEcho() 호출 후에 실행됨
	public void method3(JoinPoint point) {
		System.out.println("호출한 핵심기능 메서드명:" + point.getSignature().getName());
		System.out.println("AfterAspect.method3");
	}
	
	
}


