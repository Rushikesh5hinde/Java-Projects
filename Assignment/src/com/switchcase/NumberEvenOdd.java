package com.switchcase;

import java.util.Scanner;

public class NumberEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		switch(num%2) {
		case 0:
			System.out.println(num+" is even!");
			break;
		case 1:
			System.out.println(num+" is odd!");
			break;
			default:
				System.out.println("Invalid input");
		}
	}
}
