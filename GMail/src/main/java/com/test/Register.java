package com.test;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Register() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("fname");
		String usr=request.getParameter("user");
		String pas=request.getParameter("pwd");
		
		User obj=new User();
		obj.setName(name);
		obj.setUserName(usr);
		obj.setPassword(pas);
		
		
		if(pas.equals(obj.getPassword()))

		{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request,  response);
		}
		else
		{
			out.println("<center><font color='red'>Registration failed.</font></center>");
			RequestDispatcher rd=request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
	}

}
