package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	@GetMapping("/loginForm")
	public String home() {
		
		return "loginForm";   // /WEB-INF/views/loginForm.jsp로 포워드 요청된다.
	}
	
	
//로그인	
	@GetMapping("/login")
	public String login(LoginDTO dto, HttpSession session) {
		
		//저장된 데이터 이용해서 DB 연동해서 검증
		//session에 저장 -> 파라미터에 HttpSession session
		//                session.setAttribute로 key-value값 넣기
		session.setAttribute("login", dto);
		
		return "login";   // /WEB-INF/views/login.jsp로 포워드 요청된다.
	}
	
	
//로그아웃	
	@GetMapping("/loginCheck/logout")
	public String logout(HttpSession session) {
			session.invalidate();
			return "main";    //main으로
		}
		

//mypage 추가
	@GetMapping("/mypage")
	public String mypage() {
		
		return "main";
	}
}
