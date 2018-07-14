package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBo;
import com.nt.bo.EmployeeResultBo;

public interface EmployeeDao {
	
	public List<EmployeeResultBo> fetchEmpDetails(EmployeeBo bo);

}
