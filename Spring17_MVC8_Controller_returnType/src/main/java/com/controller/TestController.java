package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	//1. 리턴타입: String
	//뷰 정보o   모델 정보x
	@RequestMapping("/aaa")
	public String fun() {
		System.out.println("aaa 요청");
		return "hello";
	}
	
	
	//2. 리턴타입: String, 파라미터: Model, Map, @ModelAttribute("key")
	//뷰 정보o   모델 정보o
	@RequestMapping("/bbb")
	public String fun2(Model m) {
		System.out.println("bbb 요청");
		m.addAttribute("userid", "홍길동");
		return "hello2";
	}

	
	//3. 리턴타입: ModelAndView
	//뷰 정보o   모델 정보o
	@RequestMapping("/ccc")
	public ModelAndView fun3() {
		System.out.println("ccc 요청");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello2");    //view정보
		mav.addObject("userid", "홍길동");   //모델정보
		return mav;
	}


	//4. 리턴타입: LoginDTO(모델)
	//뷰 정보x   모델 정보o
	//뷰 정보는 스프링이 유추해서 찾음(요청맵핑값으로 view처리 => ddd.jsp)
	@RequestMapping("/ddd")
	public @ModelAttribute("xyz") LoginDTO fun4() {
		System.out.println("ddd 요청");
		
		LoginDTO dto = new LoginDTO("hong", "1234");
		return dto;
	}
	
	
	//5. 리턴타입: ArrayList<LoginDTO>(모델)
	//뷰 정보x   모델 정보o
	//뷰 정보는 스프링이 유추해서 찾음(요청맵핑값으로 view처리 => eee.jsp)
	@RequestMapping("/eee")
	public @ModelAttribute("kkk") ArrayList<LoginDTO> fun5() {
		System.out.println("eee 요청");
		
		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
		list.add(new LoginDTO("hong1", "1234"));
		list.add(new LoginDTO("hong2", "1234"));
		
		return list;
	}
	
	
	//6. 리턴타입: void
		//뷰 정보x   모델 정보x
		//뷰 정보는 스프링이 유추해서 찾음(요청맵핑값으로 view처리 => fff.jsp)
	@RequestMapping("/fff")
	public void fun6() {
		System.out.println("fff 요청");
	}

}
