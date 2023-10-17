package com.seed.dao;

import java.util.List;

import com.seed.Entity.Employee;

public interface EmployeeDao {
	
	public Employee save(Employee emp);
	public Employee update(Employee emp);
	public Employee delete(int id);
	public Employee findById(int empId);
	public List<Employee> findAll();

}
