package com.oops.classobject;

public class Rectangle {
	double length;
	double breadth;
	
	public void setDetails(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void calArea() {
		System.out.println("Area:"+(length*breadth));
	}
	public void calPerimeter() {
		double per=(length+breadth)*2;
		System.out.println("Perimeter:"+per);
	}
	public void display() {
		System.out.println("Length:"+length);
		System.out.println("Breadth:"+breadth);
		calArea();
		calPerimeter();
		System.out.println("-----------------");
	}
}
