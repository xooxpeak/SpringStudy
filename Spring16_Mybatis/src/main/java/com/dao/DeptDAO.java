package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository("deptDAO")
public class DeptDAO {
	
	@Autowired     // DAO에서는 Template을 주입받아야함
	SqlSessionTemplate session;
	
	//목록보기 
	public List<DeptDTO> deptList(){
		List<DeptDTO> list = session.selectList("DeptMapper.deptList");
		return list;
	}
	
	public int deptAdd(DeptDTO dto) {
		int n = session.insert("DeptMapper.deptAdd", dto);
		return n;
	}
	
	public int deptUpdate(DeptDTO dto) {
		int n = session.insert("DeptMapper.deptUpdate", dto);
		return n;
	}
	
	public int deptDelete(int deptno) {
		int n = session.insert("DeptMapper.deptDelete", deptno);
		return n;
	}
	

}
