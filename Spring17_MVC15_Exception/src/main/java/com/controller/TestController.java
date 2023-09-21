package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//http://localhost:8090/app/xxx
	@RequestMapping("/xxx")
	public String home() {
		System.out.println("TestController.home 메서드");
		// 예외처리를 위해 명시적으로 예외 발생
		if(true) throw new ArithmeticException("error 발생");
		return "hello";
	}
	
	//http://localhost:8090/app/yyy
	@RequestMapping(value="/yyy")
	public String main() {
		System.out.println("TestController.main 메서드");
		// 예외처리를 위해 명시적으로 예외 발생
		if(true) throw new NullPointerException("error 발생");
		return "hello";
	}
	
	@ExceptionHandler({ArithmeticException.class, NullPointerException.class})
	public String errorPage() {
		return "error";  // /WEB-INF/views/error.jsp
	}
}
