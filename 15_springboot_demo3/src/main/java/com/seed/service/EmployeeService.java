package com.seed.service;

import java.util.List;

import com.seed.entity.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee deleteEmployee(int id);
	public Employee getEmployeeDetails(int id);
	public List<Employee> getAllEmployees();

}
