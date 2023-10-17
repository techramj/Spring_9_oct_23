package com.seed;

import java.sql.DriverManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.seed.Entity.Employee;
import com.seed.dao.EmployeeDao;
import com.seed.dao.EmployeeDaoImplUsingJdbc;
import com.seed.service.EmployeeService;
import com.seed.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService empService = (EmployeeService) context.getBean("empService", EmployeeServiceImpl.class);
		System.out.println(empService);
		
		//add employee
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Sangita");
		emp.setSalary(20000);
		
		empService.addEmployee(emp);
		
	    empService.getAllEmployeeDetails().forEach(System.out::println);
	}
	
	
}

