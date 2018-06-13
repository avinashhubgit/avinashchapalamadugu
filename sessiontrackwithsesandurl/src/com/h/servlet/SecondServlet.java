package com.h.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
	private static String query="Insert into jobtable values(?,?,?,?,?,?,?,?,?)";
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter pw=null;
HttpSession ses=null;
Connection con=null;
RequestDispatcher rd=null;
PreparedStatement ps=null;
int expy=0,sal=0,age=0,count=0;
String loc=null,skill=null,name=null,clz=null,qly=null,gender=null;
//general settings
ses=req.getSession();
pw=res.getWriter();
rd=req.getRequestDispatcher("/thirdurl");
res.setContentType("text/html");
//read form data
expy=Integer.parseInt(req.getParameter("exp"));
loc=req.getParameter("loc");
skill=req.getParameter("skill");
sal=Integer.parseInt(req.getParameter("sal"));
//read session values
age=(Integer)ses.getAttribute("age");
name=(String)ses.getAttribute("name");
qly=(String)ses.getAttribute("quly");
gender=(String)ses.getAttribute("gender");
clz=(String)ses.getAttribute("clz");
DbRelated dbr=new DbRelated();
try{
con=dbr.useConnection();
ps=con.prepareStatement(query);
ps.setString(1,name);
ps.setInt(2, age);
ps.setString(3,gender);
ps.setString(4, qly);
ps.setString(5,clz);
ps.setInt(6, expy);
ps.setInt(7, sal);
ps.setString(8,skill);
ps.setString(9,loc);
count=ps.executeUpdate();
if(count==1)
{
pw.println("<h1 style='color:green'><center>register sucessful</center></h1>");	
}
else
{
	pw.println("<h1 style='color:red'><center>register failed</center></h1>");	
}
}
catch(Exception e)
{
	rd.forward(req,res);
}
}
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
doPost(req,res);	
}
}
