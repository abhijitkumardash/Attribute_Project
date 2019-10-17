package com.attribute.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dev.dto.Employee;

@WebServlet("/attribute")
public class AttributeServlet extends HttpServlet 
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		Employee e1 = (Employee)req.getAttribute("emp");
		out.println("<h3>"+e1+"</h3>");
	}
}
