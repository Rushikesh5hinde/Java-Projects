package com.method_ifelse;

import java.util.Scanner;

public class NumberEqual2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		if(equal(num1, num2)) {
			System.out.println(num1+" and "+num2+" are equal");
		}else {
			System.out.println(num1+" and "+num2+" are not equal");
		}
	}
	public static boolean equal(int num1,int num2) {
		return num1==num2;
	}
}
