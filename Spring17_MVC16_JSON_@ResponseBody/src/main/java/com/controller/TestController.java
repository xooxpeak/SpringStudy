package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.LoginDTO;

@Controller
public class TestController {

	//http://localhost:8090/app/main
	@RequestMapping("/main")
	public String main() {
		
		return "main";
	}
	
	//http://localhost:8090/app/xxx
		@RequestMapping("/xxx")
		public LoginDTO xxx() {
			
			LoginDTO dto = new LoginDTO();
			dto.setUserid("홍길동");
			dto.setPasswd("1234");
			
			return dto;
		}
	
	//http://localhost:8090/app/xxx
		@RequestMapping("/yyy")
		@ResponseBody                
		public LoginDTO yyy() {
			
			LoginDTO dto = new LoginDTO();
			dto.setUserid("홍길동");
			dto.setPasswd("1234");
			
			return dto;
		}
	
	//http://localhost:8090/app/xxx
		@RequestMapping("/zzz")
		@ResponseBody      // ArrayList<LoginDTO> => JSON으로 변경
		public ArrayList<LoginDTO> zzz() {
					
			ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
			list.add(new LoginDTO("Aaa1", "1234"));
			list.add(new LoginDTO("Aaa2", "1234"));
			list.add(new LoginDTO("Aaa3", "1234"));
					
			return list;
		}
	
}
