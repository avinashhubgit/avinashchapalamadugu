package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeViewController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int hour = 0;
		String wmsg = null;
		Calendar cal = null;
		cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		if (hour < 12) {
			wmsg = "good morning";
		}else if(hour<16)
		{
			wmsg="good afternoon";
		}else if(hour<18)
		{
			wmsg="good Evening";
		}else
		{
			wmsg="good night";
		}
		
		ModelAndView mav=null;
		  mav=new ModelAndView();
		  mav.setViewName("wish_tell");
		  mav.addObject("wishmessage", wmsg);
		return mav ;
	}

}
