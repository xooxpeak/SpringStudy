package com.service;

import java.util.List;
import java.util.Set;

import com.dto.Cat;

public class UserService2 {

	//Set : 순서 없고 중복 불가
	//Cat 여러마리
	Set<Cat> catSet;

	public Set<Cat> getCatSet() {
		return catSet;
	}

	public void setCatSet(Set<Cat> catSet) {
		this.catSet = catSet;
	}

	

	
	
}
