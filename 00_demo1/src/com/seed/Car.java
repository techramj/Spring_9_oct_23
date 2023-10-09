package com.seed;

public class Car extends Vehicle{

	private String name;
	private Engine engine;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, Engine engine) {
		super();
		this.name = name;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}

}
