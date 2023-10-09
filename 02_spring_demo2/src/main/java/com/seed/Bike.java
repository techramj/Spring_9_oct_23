package com.seed;

public class Bike {

	private String name;
	private String color;
	private int price;

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	

}
