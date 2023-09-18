package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	//http://localhost:8090/app/
	@GetMapping("/")
	public String home() {
		
		return "main";   // /WEB-INF/views/loginForm.jsp로 포워드 요청된다.
	}
	
	
	
}
