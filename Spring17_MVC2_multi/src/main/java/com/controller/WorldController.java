package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorldController {

	//실제 요청URL: http://localhost:8090/app/yyy
	@RequestMapping(value="/yyy")   //요청맵핑값은 유일해야하기 때문에 /xxx와 다르게 해준다.
	                           // "/yyy" 또는 value="/yyy" 둘 다 가능
	public String aaa() {     //String => view 정보를 알려준다.
		System.out.println("WorldController.aaa");
		return "/WEB-INF/views/aaa.jsp";   ///aaa()이 선택이 되면 jsp로 가게끔 한다.
	}
}

