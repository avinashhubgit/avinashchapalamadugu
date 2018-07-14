package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDto;
import com.nt.dto.EmployeeResultDto;

public interface EmployeeService {
	public List<EmployeeResultDto> fetchRecords(EmployeeDto dto);

}
