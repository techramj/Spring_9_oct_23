package com.seed;

public class Test {
	
	public static void main(String[] args) {
		
		Engine engine1 = new Engine();
		engine1.setType("2-stroke");
		engine1.setPower("220 cc");
		
		
		Bike bike1 = new Bike("Pulsar", engine1);
		Car car = new Car("Fortuner", engine1);
		
		Employee emp1 = new Employee(1,"Jack",5000, bike1);
		System.out.println(emp1);
	}

}
