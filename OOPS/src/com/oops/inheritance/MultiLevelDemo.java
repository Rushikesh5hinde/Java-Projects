package com.oops.inheritance;
class Vehicle{
	private int vno;
	private String model;
	protected double price;
	public Vehicle() {
		
	}
	public Vehicle(int vno, String model, double price) {
		this.vno = vno;
		this.model = model;
		this.price = price;
	}
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle:"+vno+" "+model+" "+price;
	}
	
}
class Car extends Vehicle{
	private int noGears;
	private String fueltype;
	public Car() {
		super();
	}
	public Car(int vno, String model, double price,int noGears,String fueltype) {
		super(vno, model, price);
		this.noGears=noGears;
		this.fueltype=fueltype;
	}
	public int getNoGears() {
		return noGears;
	}
	public void setNoGears(int noGears) {
		this.noGears = noGears;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	@Override
	public String toString() {
		return "Car:"+getVno()+" "+getModel()+" "+price;
	}
	
}
class SportsCar extends Car{
	private int milage;

	public SportsCar() {
		super();
		
	}

	public SportsCar(int vno, String model, double price, int noGears, String fueltype,int milage) {
		super(vno, model, price, noGears, fueltype);
		this.milage=milage;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "Sports Car:"+getVno()+" "+getModel()+" "+price+" "+getNoGears()+" "+getFueltype()+" "+milage;
	}
	
}
public class MultiLevelDemo {
	public static void main(String[] args) {
		SportsCar s1=new SportsCar(101, "X7", 7800000, 4, "Petrol", 60);
		System.out.println(s1);
	}
}
