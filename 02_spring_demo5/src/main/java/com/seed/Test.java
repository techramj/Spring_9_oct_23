package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void example1(ApplicationContext context) {
		
		
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
		

	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		example1(context);
	}
	

}
