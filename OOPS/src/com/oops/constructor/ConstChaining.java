package com.oops.constructor;
class Vehicle{
	int id;
	String name;
	double price;
	
	public Vehicle() {
		
	}
	public Vehicle(int id) {
		this.id=id;
	}
	public Vehicle(int id,String name) {
		this(id);
		this.name=name;
	}
	public Vehicle(int id,String name,double price) {
		this(id,name);
		this.price=price;
	}
	public String toString() {
		return "Vehicle:"+id+" "+name+" "+price;
	}
}
class Car extends Vehicle{
	float speed;
	public Car() {
		super();
	}
	public Car(int id,String name,double price,float speed)
	{
		super(id,name,price);
		this.speed=speed;
	}
	public String toString() {
		return super.toString()+" "+speed;
	}
}
public class ConstChaining {
	public static void main(String[] args) {
		Vehicle v;
		v=new Car(101, "Mustang", 8000000, 300);
		System.out.println(v);
		
	}
}
