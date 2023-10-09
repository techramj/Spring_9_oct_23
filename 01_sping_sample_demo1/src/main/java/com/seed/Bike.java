package com.seed;

public class Bike {

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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", engine=" + engine + "]";
	}

}
