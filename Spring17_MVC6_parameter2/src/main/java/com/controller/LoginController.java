package com.controller;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	@GetMapping("/loginForm")
	public String home() {
		
		return "loginForm";   // /WEB-INF/views/loginForm.jsp로 포워드 요청된다.
	}
	
	
	@GetMapping("/login")
	public String login(LoginDTO dto){
		System.out.println(dto);
		return "loginForm";   // /WEB-INF/views/loginForm.jsp로 포워드 요청된다.
	}
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/login2")
	public String login2(HttpServletRequest request){
		//사용자 입력 데이터 얻기
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		String [] phone = request.getParameterValues("phone");
		String [] email = request.getParameterValues("phone");
		
		System.out.println(userid+" "+ passwd);
		System.out.println(Arrays.toString(phone)+" " + Arrays.toString(email)+" ");
		
		return "loginForm";   // /WEB-INF/views/loginForm.jsp로 포워드 요청된다.
	}
	
	
}
