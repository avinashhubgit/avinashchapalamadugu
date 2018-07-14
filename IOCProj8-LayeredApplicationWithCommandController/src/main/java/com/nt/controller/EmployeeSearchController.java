package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.SearchCommand;
import com.nt.dto.EmployeeDto;
import com.nt.dto.EmployeeResultDto;
import com.nt.service.EmployeeService;

public class EmployeeSearchController extends AbstractCommandController {
	private EmployeeService service;

	public EmployeeSearchController(EmployeeService service) {

		this.service = service;
	}

	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object command, BindException errors)
			throws Exception {

		SearchCommand cmd = null;
		List<EmployeeResultDto> listrdto;
		EmployeeDto dto = null;
		// type cast to search command
		cmd = (SearchCommand) command;
		dto=new EmployeeDto();
		BeanUtils.copyProperties(cmd, dto);
		listrdto = service.fetchRecords(dto);
		return new ModelAndView("view_records", "listrdto", listrdto);
	}// method

}// class
