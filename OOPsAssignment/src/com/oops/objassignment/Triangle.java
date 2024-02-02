package com.oops.objassignment;

public class Triangle {
	double side1;
	double side2;
	double side3;
	
	public void setValues(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public void printArea() {
		double area=0.5*side1*side2;
		System.out.println("Area:"+area);
	}
	public void printPerimeter() {
		double per=side1+side2+side3;
		System.out.println("Perimeter:"+per);
	}
	public void printArea(int a,int b,int c) {
		this.side1=a;
		this.side2=b;
		this.side3=c;
		
		double area=0.5*side1*side2;
		System.out.println("Area:"+area);
	}
	public void printPerimeter(int a,int b,int c) {
		this.side1=a;
		this.side2=b;
		this.side3=c;
		double per=side1+side2+side3;
		System.out.println("Perimeter:"+per);
	}
}
