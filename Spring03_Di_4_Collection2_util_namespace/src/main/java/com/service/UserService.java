package com.service;

import java.util.List;

import com.dto.Cat;

public class UserService {

	//List : 순서 있고 중복 가능
	//Cat 여러마리
	List<Cat> catList;

	public List<Cat> getCatList() {
		return catList;
	}

	//setter 메서드 주입
	public void setCatList(List<Cat> catList) {
		this.catList = catList;
	}
	
	
}
