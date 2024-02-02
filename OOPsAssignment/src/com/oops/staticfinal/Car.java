package com.oops.staticfinal;

public class Car {
	//Que-1
	String model="Honda";
	static int totalCarSold=2;
	//Que-4
	double price;
	float speed;
	
	public void show() {
		model="Tata";
		totalCarSold=4;
	}
	public static void showDetails() {
//		model="Tata";
		totalCarSold=4;
	}
	//Que-5
	public static void showDetails(String name) {
		System.out.println("Name"+name);
	}
	public void showDetails(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
//		Que-2
//		Car.totalCarSold=3;
//		System.out.println("Total Cars sold:"+Car.totalCarSold);
		//Que-3
//		Car c1=new Car();
//		c1.totalCarSold=4;
//		Car c2=new Car();
//		System.out.println("Total car Sold:"+c2.totalCarSold);
		
//		Car c1=new Car();
//		System.out.println(price);
//		System.out.println(speed);
	}
}
