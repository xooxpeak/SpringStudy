package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// target인 UserService의 sayEcho() 메서드 호출 시 위빙되는 aspect객체

@Aspect
public class AfterThrowingAspect {

	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	// sayEcho() 호출해서 예외가 발생 했을 때 위빙된다.
	// throwing="e" => throwing 속성은 sayEcho()메서드에서 예외가 발생했을때 저장될 변수를 지정한다.
	@AfterThrowing(pointcut="xxx()", throwing="e") 
	public void method2(Exception e) {    
		System.out.println("AfterThrowing.method2 >>" + e.getMessage());
	}
	
	
	
	
	
//	// advice + pointcut 같이 표현
//	@AfterReturning(pointcut="execution(* callEcho(..))", returning="yyy" )    // callEcho() 호출 후에 실행됨
//	public void method3(JoinPoint point, Object yyy) {
//		System.out.println("호출한 핵심기능 메서드명:" + point.getSignature().getName());
//		System.out.println("AfterReturningAspect.method3" + yyy);
//	}
	
	
}


