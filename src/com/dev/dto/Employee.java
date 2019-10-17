package com.dev.dto;

public class Employee 
{
	private int Emp_id;
	private String Emp_name;
	private double Salary;
	private String Job;
	
	public int getEmp_id() 
	{
		return Emp_id;
	}
	public void setEmp_id(int emp_id) 
	{
		Emp_id = emp_id;
	}
	public String getEmp_name() 
	{
		return Emp_name;
	}
	public void setEmp_name(String emp_name) 
	{
		Emp_name = emp_name;
	}
	public double getSalary() 
	{
		return Salary;
	}
	public void setSalary(double salary) 
	{
		Salary = salary;
	}
	public String getJob() 
	{
		return Job;
	}
	public void setJob(String job) 
	{
		Job = job;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [Emp_id=" + Emp_id + ", Emp_name=" + Emp_name + ", Salary=" + Salary + ", Job=" + Job + "]";
	}
}