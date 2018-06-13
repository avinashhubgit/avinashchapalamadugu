package com.h.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	private static final String query_string="Insert into jobtable values(?,?,?,?,?,?,?,?,?)";
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter pw=null;
HttpSession ses=null;
PreparedStatement ps=null;
int expy=0,sal=0;
String skill=null,loc=null;
//general settings
res.setContentType("text/html");
pw=res.getWriter();
ses=req.getSession();
//read form 2 data
expy=Integer.parseInt(req.getParameter("expy"));
skill=req.getParameter("skill");
loc=req.getParameter("loc");
sal=Integer.parseInt(req.getParameter("sal"));
//set values to the session object
ses.setAttribute("expy",expy);
ses.setAttribute("sal",sal);
ses.setAttribute("skill",skill);
ses.setAttribute("loc",loc);
 String name=(String)ses.getAttribute("name");
int age=(Integer)ses.getAttribute("age");
String qly=(String)ses.getAttribute("qly");
String clg=(String)ses.getAttribute("clg");
String gender=(String)ses.getAttribute("gender");
Services ser=new Services();
try{
Connection con=ser.getCon();
ps=con.prepareStatement(query_string);
ps.setString(1,name);
ps.setInt(2, age);
ps.setString(3,gender);
ps.setString(4, qly);
ps.setString(5,clg);
ps.setInt(6, expy);
ps.setInt(7, sal);
ps.setString(8,skill);
ps.setString(9,loc);
int count=ps.executeUpdate();
if(count==1)
{
	pw.println("<h1 style='color:red'>registered sucessfully</h1>");
	}
else
{
	pw.println("<h1 style='color:red'>registered failed</h1>");
}
}catch(Exception e)
{
e.printStackTrace();	
}
}
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
doGet(req,res);	
}
}
