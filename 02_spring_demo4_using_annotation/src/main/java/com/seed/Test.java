package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed1.Car;

public class Test {
	
	
	public static void example1(ApplicationContext context) {
		
		Bike bike = context.getBean("bike1", Bike.class);
		Employee emp = context.getBean("employee", Employee.class);
		
		System.out.println(bike);
		System.out.println(emp);
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car);
		
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		example1(context);
	}
	

}
