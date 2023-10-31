package com.seed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seed.entity.Employee;
import com.seed.service.EmployeeService;

//@Component
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping(value = "/greet")
	public String greet() {
		return "Hello! Welcome to the class of Rest API";
	}
	
	@GetMapping(value="/emp")
	public List<Employee> getEmployeesDetails() {
		return empService.getAllEmployees();
	}
	
	//    /emp/1
	@GetMapping(value="emp/{id}")
	public Employee getEMployeeDetail(@PathVariable("id") int empId) {
		return empService.getEmployeeDetails(empId);
	}
	
	@GetMapping(value = "/emp/add")
	public Employee addEmployee(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("salary") double salary) {
		
		Employee emp = new Employee(id,name,salary);
		return empService.addEmployee(emp);
		
	}

}
