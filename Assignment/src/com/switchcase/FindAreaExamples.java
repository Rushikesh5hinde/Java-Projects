package com.switchcase;

import java.util.Scanner;

public class FindAreaExamples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		double radius,side,length,width,base,height,res;
		System.out.println("1.Area of Circle \n2.Area of Square\n3.Area of Right angled Triangle"
				+ "\n4.Area of Rectangle\n5.Circumference of Circle\n6.Perimeter of Square");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter radius");
			radius=sc.nextDouble();
			res=3.14*radius*radius;
			System.out.println("Area of Circle:"+res);
			break;
		case 2:
			System.out.println("Enter side");
			side=sc.nextDouble();
			res=side*side;
			System.out.println("Area of Square:"+res);
			break;
		case 3:
			System.out.println("Enter base");
			base=sc.nextDouble();
			System.out.println("Enter height");
			height=sc.nextDouble();
			res=0.5*base*height;
			System.out.println("Area of Triangle:"+res);
			break;
		case 4:
			System.out.println("Enter length");
			length=sc.nextDouble();
			System.out.println("Enter width");
			width=sc.nextDouble();
			res=length*width;
			System.out.println("Area of Rectangle:"+res);
			break;
		case 5:
			System.out.println("Enter radius");
			radius=sc.nextDouble();
			res=2*3.142*radius;
			System.out.println("Circumference of Circle:"+res);
			break;
		case 6:
			System.out.println("Enter side");
			side=sc.nextDouble();
			res=4*side;
			System.out.println("Perimeter of Square:"+res);
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
