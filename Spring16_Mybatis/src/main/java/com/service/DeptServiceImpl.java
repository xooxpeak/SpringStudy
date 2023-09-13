package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptDAO dao;   // serviceImpl에서는 dao 주입 받아야함
	
	@Override
	public List<DeptDTO> deptList() {
		return dao.deptList();
	}

	//이전 Mybatis에서는 명시적으로 commit을 지정했었는데 스프링에서는 자동으로 commit 됨 ! 
	
	@Override
	public int deptAdd(DeptDTO dto) {
		return dao.deptAdd(dto);
	}

	@Override
	public int deptUpdate(DeptDTO dto) {
		return dao.deptUpdate(dto);
	}

	@Override
	public int deptDelete(int deptno) {
		return dao.deptDelete(deptno);
	}

}
