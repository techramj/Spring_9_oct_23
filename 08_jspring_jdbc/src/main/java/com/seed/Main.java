package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seed.Entity.Employee;
import com.seed.dao.EmployeeDao;
import com.seed.dao.EmployeeDaoImplUsingJdbc;
import com.seed.service.EmployeeService;
import com.seed.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService empService = (EmployeeService) context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
		System.out.println(empService);
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("sam");
		emp.setSalary(50000);
		 
		empService.addEmployee(emp);
	}
	
	

}
