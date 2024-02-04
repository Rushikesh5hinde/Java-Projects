package com.switchcase;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice,n1,n2;
		System.out.println("Enter first number");
		n1=sc.nextInt();
		System.out.println("Enter second number");
		n2=sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println(n1/n2);
			break;
		case 5:
			System.out.println(n1%n2);
			break;
		default:
			System.out.println("Invalid input!");
		}
	}
}
