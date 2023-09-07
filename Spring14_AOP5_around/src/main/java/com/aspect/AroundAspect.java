package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// target인 UserService의 sayEcho() 메서드 호출 시 위빙되는 aspect객체

@Aspect
public class AroundAspect {

	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	// sayEcho() 호출해서 호출전, 호출후, 정상적으로 리턴, 예외발생시 모두 위빙된다.
	// throwing="e" => throwing 속성은 sayEcho()메서드에서 예외가 발생했을때 저장될 변수를 지정한다.
	@Around(value = "xxx()") 
	public Object method2(ProceedingJoinPoint pjp)throws Throwable {     //throws Throwable : afterThrowing 역할
		System.out.println("@@Around.method2 >>");
		System.out.println("before advice 역할");                         //before advice 역할 
		Object xxx = pjp.proceed();  //sayEcho() 호출하고 리턴값은 xxx에 저장
		System.out.println("after advice 역할");                         //after advice 역할
		System.out.println("afterReturning advice 역할" + xxx);         //afterReturning advice 역할
		
		return xxx;   //sayEcho() 호출한 곳으로 리턴 => main에서 받는다.
	}
	
	
	
	
	
//	// advice + pointcut 같이 표현
//	@AfterReturning(pointcut="execution(* callEcho(..))", returning="yyy" )    // callEcho() 호출 후에 실행됨
//	public void method3(JoinPoint point, Object yyy) {
//		System.out.println("호출한 핵심기능 메서드명:" + point.getSignature().getName());
//		System.out.println("AfterReturningAspect.method3" + yyy);
//	}
	
	
}


