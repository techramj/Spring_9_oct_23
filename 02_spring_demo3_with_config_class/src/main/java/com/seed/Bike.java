package com.seed;

import java.util.Objects;

public class Bike {

	private String name;
	private String color;
	private int price;

	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	public Bike(String name, String color) {
		this.name = name;
		this.color = color;
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

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name) && price == other.price;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Bike) {
			Bike b2=  (Bike)obj;
			return this.name.equals(b2.name) && this.color.equals(b2.color ) && this.price == b2.price;
		}
		
		return false;
	}*/
	//bike1.equals(bike2)
	
	

}
