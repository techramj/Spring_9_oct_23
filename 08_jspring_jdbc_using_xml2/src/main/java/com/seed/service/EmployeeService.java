package com.seed.service;

import java.util.List;

import com.seed.Entity.Employee;
import com.seed.dao.EmployeeDao;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee deleteEmployee(int id);
	public Employee updateEmployee(Employee emp);
	public Employee getEmployeeDetails(int empId);
	public List<Employee> getAllEmployeeDetails();
	public void setEmployeeDao(EmployeeDao dao);

}
