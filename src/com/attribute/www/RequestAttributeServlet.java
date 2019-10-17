package com.attribute.www;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dev.dto.Employee;

@WebServlet("/attr")
public class RequestAttributeServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Employee e1 = new Employee();
		e1.setEmp_id(101);
		e1.setEmp_name("Abhijit Kumar Dash");
		e1.setSalary(20000);
		e1.setJob("Developer");
		
		req.setAttribute("emp", e1);
		RequestDispatcher rd = req.getRequestDispatcher("/attribute");
		rd.forward(req, resp);
	}
}
