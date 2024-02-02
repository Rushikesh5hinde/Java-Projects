package com.oops.classobject;

import java.util.Scanner;

public class ReactangleTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double length,breadth;
		
		System.out.println("Enter length");
		length=sc.nextDouble();
		System.out.println("Enter breadth");
		breadth=sc.nextDouble();
		
		Rectangle r1=new Rectangle();
		r1.setDetails(length, breadth);
		r1.display();
	}
}
