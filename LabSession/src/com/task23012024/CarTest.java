package com.task23012024;
class Car{
	protected String name;
	protected int capacity;
	Car displayDetails(){
		name="X6";
		capacity=6;
		return this;
	}
}
class SUV extends Car{
	@Override
	SUV displayDetails() {
		name="Supra";
		capacity=4;
		return this;
	}
	void display() {
		System.out.println("SUV");
	}
}
public class CarTest {
	public static void main(String[] args) {
		SUV obj=new SUV();
//		SUV obj1=(SUV) obj.displayDetails();
		
		Car c1=obj.displayDetails();
		
	}
}
