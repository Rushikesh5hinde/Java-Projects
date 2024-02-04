package com.inheritance;

public class Vehicle {
	private String brand;
	private double price;
	static int num=100;
	public Vehicle() {
		
	}
	public Vehicle(String brand,double price) {
		this();
		this.brand=brand;
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return "Vehicle:"+brand+" "+price;
	}
}
