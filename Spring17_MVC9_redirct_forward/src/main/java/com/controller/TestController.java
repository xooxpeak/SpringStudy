package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	//redirect 요청
	//이전 서블릿 : response.sendRedirect("xxx");
	@RequestMapping("/aaa")
	public String aaa(Model m) {
		System.out.println("aaa 호출");
		m.addAttribute("userid", "홍길동");
		return "redirect:xxx";
	}
	
	//forward 요청
	//이전 서블릿 : request.getRequestDispatcher("target").forward(request, response);
		@RequestMapping("/bbb")
		public String bbb(Model m) {
			System.out.println("bbb 호출");
			m.addAttribute("userid", "이순신");
			return "forward:xxx";
		}

	@RequestMapping("/xxx")
	public String main() {
		System.out.println("main 호출");
		return "main";
	}
	
	
}
