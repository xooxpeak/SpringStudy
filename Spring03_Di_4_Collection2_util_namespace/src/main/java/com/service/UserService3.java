package com.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dto.Cat;

public class UserService3 {

	//Map
	//Cat 여러마리
	
	Map<String, Cat> catMap;

	public Map<String, Cat> getCatMap() {
		return catMap;
	}

	//setter메서드 의존성 주입
	public void setCatMap(Map<String, Cat> catMap) {
		this.catMap = catMap;
	}
	
	

	
	
}
