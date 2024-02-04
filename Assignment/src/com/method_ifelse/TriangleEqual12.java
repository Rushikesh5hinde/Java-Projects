package com.method_ifelse;

import java.util.Scanner;

public class TriangleEqual12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int side1,side2,side3;
		System.out.println("Enter first side of triangle");
		side1=sc.nextInt();
		System.out.println("Enter second side of triangle");
		side2=sc.nextInt();
		System.out.println("Enter third side of triangle");
		side3=sc.nextInt();
		checkTriangle(side1, side2, side3);
	}
	public static void checkTriangle(int side1,int side2,int side3) {
		if(side1==side2 && side2==side3) {
			System.out.println("Equilateral Triangle");
		}else if(side1==side2 || side2==side3 || side3==side1) {
			System.out.println("Isosceles Triangle");
		}else {
			System.out.println("Scalene Triangle");
		}
	}
}
