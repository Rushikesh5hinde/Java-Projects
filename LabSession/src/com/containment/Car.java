package com.containment;

public class Car {
	private int carNo;
	private String brand;
	private String model;
	private Driver driver;
	
	public Car() {
		
	}
	public Car(int carNo,String brand,String model,Driver driver) {
		this.carNo=carNo;
		this.brand=brand;
		this.model=model;
		this.driver=driver;
	}
	public void setCarNo(int carNo) {
		this.carNo=carNo;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setDriver(Driver driver) {
		this.driver=driver;
	}
	public Driver getDriver() {
		return driver;
	}
	public String toString() {
		return "Car:"+carNo+" "+brand+" "+model+" "+driver;
	}
}
