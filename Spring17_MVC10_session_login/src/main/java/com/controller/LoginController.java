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
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		//로그아웃하려면 로그인이 되어있어야 하니 로그인 체크를 해준다.
		//파라미터에 HttpSession session을 작성하면 자동으로 생성해서 저장해준다.
		//만약 로그인을 했으면 session에서 key값에 해당되는 값이 있을거다. 
		//로그인 체크 여부 확인
		LoginDTO dto =(LoginDTO)session.getAttribute("login");
		if(dto==null) {   //null = 로그인 안됨
			return "redirect:loginForm";    //loginForm으로 리다이렉트
		}else {   //not null = 로그인 됨
			session.invalidate();
			return "main";    //main으로
		}
		
	}
	
}
