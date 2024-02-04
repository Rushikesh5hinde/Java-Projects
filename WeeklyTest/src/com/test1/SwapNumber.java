package com.test1;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number");
		num1=sc.nextInt();//10
		System.out.println("Enter second number");
		num2=sc.nextInt();//5
		num1=num1+num2;//15
		num2=num1-num2;//10
		num1=num1-num2;//5
		System.out.println(num1);
		System.out.println(num2);
	}
}
