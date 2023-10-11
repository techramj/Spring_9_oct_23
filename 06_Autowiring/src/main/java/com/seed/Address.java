package com.seed;

public class Address {

	private String city;
	private String pincode;
	private String landmark;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String pincode, String landmark) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", landmark=" + landmark + "]";
	}

}
