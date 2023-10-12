package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void createObjectUsingSpringConfig(ApplicationContext context) {
		// step 2: get the bean
		Bike b1 = context.getBean("bike", Bike.class);
		Bike b2 = context.getBean("bike1", Bike.class);

		System.out.println(b1);
		System.out.println(b2);
		
		Employee emp= context.getBean("employee", Employee.class);
		System.out.println(emp+"  "+emp.getBike());
	}

	public static void checkScope(ApplicationContext context) {
		Bike b1 = context.getBean("bike", Bike.class);
		Bike b2 = context.getBean("bike", Bike.class);
		
		System.out.println(b1==b2);
	}

	public static void main(String[] args) {
		// step 1: create applicationContext object
		// xml file
		// ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// config class
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		createObjectUsingSpringConfig(context);
		
		
		
		
	}

}
