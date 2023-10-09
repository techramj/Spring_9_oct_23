package com.seed;

public class Bike extends Vehicle {

	private String name;
	private Engine engine;

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(String name, Engine engine) {
		this.engine = engine;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", engine=" + engine + "]";
	}

}
