package com.h.service;

import com.h.bo.EmployeBO;
import com.h.dao.EmployeDao;
import com.h.dto.EmployeDTO;

public class EmployeService {
	private EmployeDao dao;
	EmployeBO bo;
	public void setDao(EmployeDao dao)
	{
		this.dao=dao;
	}
public String genResult(EmployeDTO dto)throws Exception
{
	int eno=0;
	String name=null;
	int sal=0;
	String job=null;
	int grossal;
	int netsal=0;
	//get values
	eno=dto.getEno();
	name=dto.getEname();
	sal=dto.getSal();
	job=dto.getJob();
	//generate values
	grossal=(sal/100)*15;
	netsal=(sal/100)*50;
	bo=new EmployeBO();
	bo.setEname(name);
	bo.setEno(eno);
	bo.setGrosssal(grossal);
	bo.setNetsal(netsal);
	bo.setSal(sal);
	int count=dao.insert();
	if(count==0)
	{
		return "Registration failed";
	}
	else{
		return "registration sucess";
	}
}
}
