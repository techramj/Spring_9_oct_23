package com.seed;

public class EmployeeGenerator {
	
	public static Employee getDummyEmployee() {
		Engine engine1 = new Engine();
		engine1.setType("2-stroke");
		engine1.setPower("220 cc");
		
		Bike bike1 = new Bike("Pulsar", engine1);
		
		return new Employee(1,"Jack",5000, bike1);
	}

}
