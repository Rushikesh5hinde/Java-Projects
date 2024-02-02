package com.oops.interfacedemo;
interface Operations{
	
	void area();
	default void volume() {
		System.out.println("volume method");
		
		getPan();
		display();
	}
	//JAVA 8:common implementation,belongs to interface
	
	static void info() {
		System.out.println("Geometry shapes");
		display();
	}
	static double getPi() {
		return 3.142;
	}
	//JAVA 9:confidential information
	//can be called inside default method
	private void getPan() {
		System.out.println("Pan:IRCPS123X");
	}
	//can be called inside default as well as static method
	private static void display() {
		System.out.println("Educational purpose");
	}
}
class Square implements Operations{
	double side;
	public Square() {
		
	}
	public Square(double side) {
		this.side=side;
	}
	public void area() {
		System.out.println("Area of square:"+(side*side));
	}
}
class Cube implements Operations{
	double side;
	public Cube() {
		
	}
	public Cube(double side) {
		this.side=side;
	}
	public void area() {
		System.out.println("Area of Cube:"+(6*side*side));
	}
	public void volume() {
		System.out.println("Volume of Cube:"+(side*side*side));
	}
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		Operations o;
		o=new Square(4);
		o.area();
		o.volume();
		
		o=new Cube(2);
		o.area();
		o.volume();
	}
}
