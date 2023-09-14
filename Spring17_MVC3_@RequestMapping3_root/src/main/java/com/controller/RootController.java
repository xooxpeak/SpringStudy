package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")   //중복되는 부분을 root로 뽑는다.
public class RootController {
	
	
	//http://local:8090/app/member/add
	@RequestMapping(value="/add")
    public String add(){
    	System.out.println("TestController.add");
    	return "/WEB-INF/views/main.jsp";
    }

	//http://local:8090/app/member/adel
    @RequestMapping(value="/del")
    public String del(){
    	System.out.println("TestController.del");
    	return "/WEB-INF/views/main.jsp";
    }
}
