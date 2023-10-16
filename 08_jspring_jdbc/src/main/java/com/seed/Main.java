package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seed.dao.EmployeeDao;
import com.seed.dao.EmployeeDaoImplUsingJdbc;
import com.seed.service.EmployeeService;
import com.seed.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		//object of service
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService empService = (EmployeeService) context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
		System.out.println(empService);
	}
	
	public static void withoutSpring() {
		EmployeeService empService = new EmployeeServiceImpl();
		//EmployeeDao empDao = new EmployeeDaoImplUsingJdbc();
		//empService.setEmployeeDao(empDao);
		
		empService.addEmployee(null);
		
		
	}

}
