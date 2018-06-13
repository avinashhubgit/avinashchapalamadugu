package com.h.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter pw=null;
HttpSession ses=null;
String name=null,gender=null,quly=null,clz=null;
int age=0;
//general settings
res.setContentType("text/html");
pw=res.getWriter();
ses=req.getSession();
name=req.getParameter("name");
age=Integer.parseInt(req.getParameter("age"));
gender=req.getParameter("gen");
quly=req.getParameter("qly");
clz=req.getParameter("clg");
ses.setAttribute("name",name);
ses.setAttribute("age",age);
ses.setAttribute("gender",gender);
ses.setAttribute("quly",quly);
ses.setAttribute("clg",clz);
pw.println("<h1>second form page<h1>");
pw.println("<form action="+res.encodeUrl("secondurl")+" method='post'>");
pw.println("<table>");
pw.println("<tr><td>Experience::</td><td><input type='text' name='exp'><br></td></tr>");
pw.println("<tr><td>Salary::</td><td><input type='text' name='sal'><br></td></tr>");
pw.println("<tr><td>Location::</td><td><input type='text' name='loc'><br></td></tr>");
pw.println("Skills::<select name='skill'>");
pw.println("<option value='java'>JAVA</option>");
pw.println("<option value='.net'>.NET</option>");
pw.println("<option value='php'>PHP</option>");
pw.println("<option value='anjular js'>ANJULARJS</option>");
pw.println("</select><br>");
pw.println("<tr><td><input type='submit' value='continue'></td></tr>");
pw.println("</table>");
pw.println("</form>");

}
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	doGet(req,res);
	}
}
