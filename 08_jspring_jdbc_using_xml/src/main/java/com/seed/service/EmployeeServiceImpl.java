package com.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seed.Entity.Employee;
import com.seed.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao empDao;

	@Override
	public Employee addEmployee(Employee employee) {
		return empDao.save(employee);
	}

	@Override
	public Employee deleteEmployee(int id) {
		return empDao.delete(id);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return empDao.update(emp);
	}

	@Override
	public Employee getEmployeeDetails(int empId) {
		return empDao.findById(empId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		return empDao.findAll();
	}

	@Override
	public void setEmployeeDao(EmployeeDao dao) {
		this.empDao = dao;
		
	}
	
	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
}
