package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		System.out.println(username);
		/*PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Welcome "+ username+ "</h3>");
		out.println("</body>");
		out.println("</html>");*/
		
		if("jessica".equalsIgnoreCase(username)) {
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/success.jsp"); //view
			req.setAttribute("username", username);  //model 
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp"); //view
			req.setAttribute("error", "Invalid username and password");  //model 
			rd.forward(req, resp);
		}
		
	}
	

}
