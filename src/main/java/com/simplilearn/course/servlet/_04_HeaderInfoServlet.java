package com.simplilearn.course.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HeaderInfoServlet")
public class _04_HeaderInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String host = request.getHeader("Host");
		String platform = request.getHeader("Sec-Ch-Ua-Platform");
		String agent = request.getHeader("User-Agent");
		
		/*
		 *Get the list of existing Headers from the request object 
		 */
		
		Iterator<String> ite = request.getHeaderNames().asIterator();
		while(ite.hasNext()) {
			String name = ite.next();
			System.out.println(name + " " + request.getHeader(name));
		}
		
	
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Header HttpServlet Class Example</h1>");
		out.print("<br>");
		out.print("<h2>Host:" + host + "</h2>");
		out.print("<h2>Platform:" + platform + "</h2>");
		out.print("<h2>Agent:" + agent + "</h2>");
		out.print("</body>");
		out.print("</html>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
