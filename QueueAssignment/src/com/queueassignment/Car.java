package com.queueassignment;

public class Car {
	private int id;
	private String brand;
	private double speed;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String brand, double speed) {
		super();
		this.id = id;
		this.brand = brand;
		this.speed = speed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", speed=" + speed + "]";
	}
//	@Override
//	public int compareTo(Car c) {
//		
//		return (int) (this.speed-c.speed);
//	}
	
}
