package com.attribute.www;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.dto.Employee;

@WebServlet("/sessionattribute")
public class SessionAttributeServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Employee emp = new Employee();
		
		emp.setEmp_id(200);
		emp.setEmp_name("Debasish Dash");
		emp.setJob("Analyst");
		emp.setSalary(240000);
		
		HttpSession session = req.getSession(true);
		session.setAttribute("employee", emp);
		System.out.println("Attributes Set");
	}
}