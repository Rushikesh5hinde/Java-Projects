package com.switchcase;

import java.util.Scanner;

public class NumberToWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
