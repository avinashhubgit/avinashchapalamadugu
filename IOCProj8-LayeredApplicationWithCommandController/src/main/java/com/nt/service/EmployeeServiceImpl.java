package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBo;
import com.nt.bo.EmployeeResultBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;
import com.nt.dto.EmployeeResultDto;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao;

	public EmployeeServiceImpl(EmployeeDao dao) {

		this.dao = dao;
	}

	@Override
	public List<EmployeeResultDto> fetchRecords(EmployeeDto dto) {

		List<EmployeeResultBo> listrbo = null;
		EmployeeBo bo = null;
		List<EmployeeResultDto> listrdto = null;
		EmployeeResultDto rdto = null;
		// create object for bo
		bo = new EmployeeBo();
		// pass data through dto to bo
		BeanUtils.copyProperties(dto, bo);
		// invoke the method dao class method
		listrbo = dao.fetchEmpDetails(bo);
		// create object for resultdto
		listrdto = new ArrayList<>();
		// create aa loop
		for (EmployeeResultBo rbo : listrbo) {
			rdto=new EmployeeResultDto();
			
			BeanUtils.copyProperties(rbo, rdto);
			dto.setSno(listrdto.size()+1);
			listrdto.add(rdto);
		}

		return listrdto;
	}// method

}// class
