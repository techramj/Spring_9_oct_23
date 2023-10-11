package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void example1(ApplicationContext context) {
		Department department = new Department();
		Address address = new Address();
		Bike bike = new Bike();
		Account account = new Account();
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jack");
		emp.setSalary(2000);
		emp.setAddress(address);
		emp.setAccount(account);
		emp.setDepartment(department);
		emp.setBike(bike);
		
		System.out.println(emp);
	}
	
	public static void example2(ApplicationContext context) {
		
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
		
		System.out.println();
		
		Employee e2 = context.getBean("emp2", Employee.class);
		System.out.println(e2);
		
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		example2(context);
		
	}
	
	

}
