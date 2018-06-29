package com.h.controller;

import com.h.dto.EmployeDTO;
import com.h.service.EmployeService;
import com.h.vo.EmployeVO;

public class EmployeControl {
	private EmployeService service;
	public void setService(EmployeService service)
	{
		this.service=service;
		
	}
public String convert(EmployeVO vo)throws Exception
{
	EmployeDTO dto=null;

dto=new EmployeDTO();
dto.setEno(Integer.parseInt(vo.getEno()));
dto.setEname(vo.getEname());
dto.setJob(vo.getJob());
dto.setSal(Integer.parseInt(vo.getSalary()));
String result=service.genResult(dto);
return result;
}
}
