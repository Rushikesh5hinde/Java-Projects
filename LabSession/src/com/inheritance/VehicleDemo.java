package com.inheritance;
class Vehicle1{
	private String color;
	private int nowheels;
	
	public Vehicle1() {
		
	}
	public Vehicle1(String color,int nowheels) {
		this.color=color;
		this.nowheels=nowheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNowheels() {
		return nowheels;
	}
	public void setNowheels(int nowheels) {
		this.nowheels = nowheels;
	}
	public String toString() {
		return "Vehicle:"+color+" "+nowheels;
	}
}
class Car1 extends Vehicle1{
	protected int capacity;
	
	public Car1() {
		super();
	}
	public Car1(String color,int nowheels,int capacity) {
		super(color,nowheels);
		this.capacity=capacity;
	}
	public String toString() {
		return "Car:"+super.toString()+" "+capacity;
	}
}
class Suv extends Car1{
	protected int power;
	
	public Suv() {
		super();
	}
	public Suv(String color,int nowheels,int capacity,int power) {
		super(color,nowheels,capacity);
		this.power=power;
	}
	public String toString() {
		return "SUV:"+super.toString()+" "+power;
	}
}
public class VehicleDemo {
	public static void main(String[] args) {
		Suv s1=new Suv("Red", 4, 4, 800);
		System.out.println(s1);
	}
}
