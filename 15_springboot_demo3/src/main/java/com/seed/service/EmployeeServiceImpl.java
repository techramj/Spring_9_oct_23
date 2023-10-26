package com.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seed.entity.Employee;
import com.seed.repository.EmployeeRepository;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepository.save(employee);
	}


	@Override
	public Employee deleteEmployee(int id) {
		
		return empRepository.delete(id);
	}

	@Override
	public Employee getEmployeeDetails(int id) {
		
		return empRepository.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}

}
