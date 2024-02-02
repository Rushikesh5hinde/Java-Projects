package com.oops.objassignment;

import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double length,breadth;
		System.out.println("Enter length");
		length=sc.nextDouble();
		System.out.println("Enter breadth");
		breadth=sc.nextDouble();
		Area a1=new Area();
		a1.setDim(length, breadth);
		System.out.println("Area:"+a1.getArea());
	}
}
