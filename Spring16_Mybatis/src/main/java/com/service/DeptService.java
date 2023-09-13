package com.service;

import java.util.List;

import com.dto.DeptDTO;

public interface DeptService {
	
	public List<DeptDTO> deptList();   //추상메서드
	public int deptAdd(DeptDTO dto);
	public int deptUpdate(DeptDTO dto);
	public int deptDelete(int deptno);
}
