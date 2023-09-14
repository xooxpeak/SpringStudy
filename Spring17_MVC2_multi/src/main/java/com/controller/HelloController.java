package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	//실제 요청URL: http://localhost:8090/app/xxx
	@RequestMapping("/xxx")
	public String aaa() {     //String => view 정보를 알려준다.
		System.out.println("HelloController.aaa");
		return "/WEB-INF/views/aaa.jsp";   ///aaa()이 선택이 되면 jsp로 가게끔 한다.
	}
}

