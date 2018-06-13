package com.h.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	PrintWriter pw=null;
	HttpSession ses=null;
	String name=null,qly=null,clg=null,gender;
	int age=0;
	//general settings
	res.setContentType("text/html");
	pw=res.getWriter();
	//create session obj
	ses=req.getSession();
	//get form data
	name=req.getParameter("name");
	age=Integer.parseInt(req.getParameter("age"));
	qly=req.getParameter("qly");
	clg=req.getParameter("clg");
	gender=req.getParameter("gender");
	//set values to the session object
	ses.setAttribute("name",name);
	ses.setAttribute("age",age);
	ses.setAttribute("qly",qly);
	ses.setAttribute("clg",clg);
	ses.setAttribute("gender", gender);
	//set value to the dto
	/*DtoServlet dto=new DtoServlet();
	dto.setAge(age);
	dto.setName(name);
	dto.setQualification(qly);
	dto.setCollege(clg);*/
	//create another form
	pw.println("<body bgcolor='green'>");
	pw.println("<form action='secondurl' method='post'>");
	pw.println("Experience::<input type='text' name='expy'><br>");
	pw.println("Location::<input type='text' name='loc'><br>");
	pw.println("Skills::<select name='skill'><br>");
	pw.println("<option value='java'>JAVA</option>");
	pw.println("<option value='.net'>.NET</option>");
	pw.println("<option value='php'>PHP</option>");
	pw.println("<option value='anjularjs'>ANJULARJS</option></select><br>");
	
	pw.println("Salary::<input type='text' name='sal'><br>");
	pw.println("<input type='submit' value='Enter'>");
	pw.println("</body>");
}
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
doGet(req,res);	
}
}
