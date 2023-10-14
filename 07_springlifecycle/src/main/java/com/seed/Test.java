package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("-----------------------------------------------------");
		Bike bike = context.getBean("bike1", Bike.class);
		System.out.println("bean bike  is ready to used\n"+bike);
		
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}
	
	

}
