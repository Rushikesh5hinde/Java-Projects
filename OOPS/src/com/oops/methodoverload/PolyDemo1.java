package com.oops.methodoverload;

class Shape{
	
	void area(int side) {
		System.out.println("Area of Square:"+(side*side));
	}
	void area(int len,int bre) {
		System.out.println("Area of Rectanngle:"+(len*bre));
	}
	void area(float radius) {
		System.out.println("Area of circle:"+(3.142*radius*radius));
	}
}
public class PolyDemo1 {
	public static void main(String[] args) {
		Shape s1=new Shape();
		s1.area(5);
		s1.area(5,4);
		s1.area(4.5f);
		
		main(90);
	}
	public static void main(int data) {
		System.out.println("overload main");
		System.out.println("Data:"+data);
	}
	public static void main(String data) {
		System.out.println("Data"+data);
	}
}
