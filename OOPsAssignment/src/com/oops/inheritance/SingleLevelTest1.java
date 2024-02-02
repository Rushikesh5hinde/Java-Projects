package com.oops.inheritance;
class Vehicle{
	void run() {
		
	}
}
class Car extends Vehicle{
	@Override
	void run() {
		System.out.println("Car is running");
	}
}
public class SingleLevelTest1 {
	public static void main(String[] args) {
		Vehicle v;
		v=new Car();
		v.run();
	}
}
