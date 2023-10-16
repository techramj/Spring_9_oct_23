package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("-----------------------------------------------------");
		Employee emp1 = context.getBean("emp", Employee.class);
		Employee emp2 = context.getBean("emp", Employee.class);
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1.getAddress() == emp2.getAddress());
		
		Address add1 = context.getBean("address", Address.class);
		Address add2 = context.getBean("address", Address.class);
		System.out.println(emp1.getAddress() == add1);
		System.out.println(add1 == add2);
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}
	
	

}
