package com.oops.objassignment;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double length,breadth;
		System.out.println("Enter length");
		length=sc.nextDouble();
		System.out.println("Enter breadth");
		breadth=sc.nextDouble();
		Rectangle r1=new Rectangle();
		r1.setValues(length, breadth);
		double area=r1.returnArea(length, breadth);
		System.out.println("Area of Rectangle:"+area);
	}
}
