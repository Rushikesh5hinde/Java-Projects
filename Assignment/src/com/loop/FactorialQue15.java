package com.loop;

import java.util.Scanner;

public class FactorialQue15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Factorial:"+factorial(num));
	}
	public static int factorial(int num) {
		int fact=1,i=1;
		while(i<=num) {
			fact*=i;
			i++;
		}
		return fact;
	}
}
