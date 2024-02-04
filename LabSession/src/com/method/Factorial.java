package com.method;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Factorial:"+findFactorial(num));
	}
	public static long findFactorial(int num) {
		long fact=1;
		int i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		return fact;
	}
}
