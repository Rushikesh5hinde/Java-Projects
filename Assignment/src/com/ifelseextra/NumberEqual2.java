package com.ifelseextra;

import java.util.Scanner;

public class NumberEqual2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		if(num1==num2) {
			System.out.println(num1+" and "+num2+" are equal");
		}else {
			System.out.println(num1+" and "+num2+" are not equal");
		}
	}
}
