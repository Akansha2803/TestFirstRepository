package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloController extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		String userName = request.getParameter("userName");
		System.out.println("UserName is ..." +userName);
		request.setAttribute("userName", userName);
		
	/*	HttpSession session = request.getSession();
		session.setAttribute("userName", userName);*/
		
		try {
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
			//response.sendRedirect("result.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
