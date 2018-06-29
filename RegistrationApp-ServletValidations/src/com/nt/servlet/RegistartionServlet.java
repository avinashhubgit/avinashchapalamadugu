package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistartionServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = null, page = null, r1 = null, h1 = null;
		int age = 0;
		List<String> errList = null;
		PrintWriter pw = null;
		// get general settings
		pw = res.getWriter();
		// set content type
		res.setContentType("text/html");
		page = req.getParameter("page");
		r1 = req.getParameter("r1");
		name = req.getParameter("pname");
		h1 = req.getParameter("h1");
		errList = new ArrayList<>();
		if (h1.equals("no")) {
			if (name == null || name == "") {
				errList.add("<h1>name must be filled in the text field</h1>");

			}

			if (page == null || page == "") {
				errList.add("<h1>age must be filled in textfield </h1>");

			} else if (!page.equals(""))
				try {
					age = Integer.parseInt(page);
					if (age < 0 || age > 126) {
						errList.add("<h1>age must be in b/w 1 through 25</h1>");

					}
				} catch (Exception e) {
					errList.add("<h1>age must be in numeric</h1>");

				}
			else
				age = Integer.parseInt(page);

			if (errList.size() != 0) {
				for (String err : errList) {
					pw.println(err);
					return;
				}
			} // if

		} // if
		if (r1.equalsIgnoreCase("m")) {
			if (age < 18) {
				pw.println(name + "u r not eligible for voting");
			} else
				pw.println(name + "u  r  eligible for voting");
		} else if (age < 18) {
			pw.println(name + " u r not  eligible for voting");
		} else {
			pw.println(name + "u r eligible for voting");
		}
		// hyperlink
		pw.println("<h1> <a href='Registration.html'>home</a></h1>");
		// close the print stream
		pw.close();
	}

}
