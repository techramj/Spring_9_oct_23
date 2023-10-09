package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void createObjectInCoreJava() {
		
		//object using setter  i.e properties
		Bike bike1 = new Bike();
		bike1.setName("RE");
		bike1.setColor("Black");
		bike1.setPrice(220000);
		
		
		//object using constructor
	    Bike bike2 = new Bike("Pulsar", "red", 120000);
		
	}
	
	public static void createObjectUsingSpring() {
		//step 1: create applicationContext object
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//step 2: get the bean
		Bike b1 = context.getBean("bike3", Bike.class);
		Bike b2 = context.getBean("bike4", Bike.class);
		
		System.out.println(b1);
		System.out.println(b2);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		//createObjectInCoreJava();
		
		createObjectUsingSpring();
		
		
		System.out.println("end");
	}
	

}
