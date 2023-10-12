package com.seed;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean
	@Scope(scopeName = "prototype")
	public Bike bike() {
		Bike bike = new Bike();
		bike.setName("Yezdi");
		bike.setColor("Grey");
		bike.setPrice(280000);
		return bike;
	}
	

	@Bean
	public Bike bike1() {
		Bike bike = new Bike("Pulsar","red",100000);
		return bike;
	}
	
	@Bean
	public Employee employee() {
		Employee emp = new Employee(1, "Sam", 5000);
		emp.setBike(bike());
		return emp;		
	}

}
