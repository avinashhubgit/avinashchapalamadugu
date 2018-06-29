package com.nt.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.handler.RequestHandler1;
import com.nt.handler.RequestHandler2;

public class ControllerServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	RequestHandler1 handle=null;
    RequestHandler2 handle2=null;
	String virtualurl=null;
	Date date=null;
	Properties prop=null;
	String urlname=null;
	RequestDispatcher rd=null;
	   //get the url
	virtualurl=req.getServletPath();
	if(virtualurl.equalsIgnoreCase("link1.do"))
	{
		handle=new RequestHandler1();
		//invoke the method
		date=handle.processRequest1();
		req.setAttribute("result", date);
	}else
	{
		handle2=new RequestHandler2();
		//invoke the properties method
		prop=handle2.processRequest();
		req.setAttribute("result",prop);
	}
	urlname="/view_page.jsp";
	rd=req.getRequestDispatcher(urlname); 
	rd.forward(req, res);
	
	}
		
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}
}
