package com.simplilearn.course.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ParametersServlet")
public class _03_ParametersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
	
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Parameters HttpServlet Class Example</h1>");
		out.print("<br>");
		out.print("<h2>First Name:" + firstName + "</h2>");
		out.print("<h2>Last Name:" + lastName + "</h2>");
		out.print("</body>");
		out.print("</html>");
	
	}
	//http://localhost:8080/simplilearn-servlet/ParametersServlet?firstName=Quetellen&lastName=Johnson
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
