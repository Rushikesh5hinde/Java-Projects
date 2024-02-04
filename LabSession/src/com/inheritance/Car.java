package com.inheritance;
	
public class Car extends Vehicle{
	private int carno;
	private String color;
	int num=50;
	public Car() {
		super();
	}
	public Car(String brand,double price,int carno,String color) {
		super(brand,price);
		this.carno=carno;
		this.color=color;
	}
	public void setCarNo(int carno) {
		this.carno=carno;
	}
	public int getCarNo() {
		return carno;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return "Car:"+carno+" "+color+" "+super.toString();
	}
	public static void main(String[] args) {
		Car c1=new Car("tata", 20000, 123, "red");
//		System.out.println(c1);
		System.out.println(c1.num);
	}
}
