package com.demo.method;

import java.util.Scanner;

public class FactorialDivisibleBy5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		int fact=factorial(num);
		System.out.println("Factorial is:"+fact);
		if(fact%5==0)
			System.out.println(fact+" is divisible by 5");
		else
			System.out.println(fact+" is not divisible by 5");
	}
	public static int factorial(int num)
	{
		int fact=1;
		while(num!=0) {
			fact=fact*num;
			num--;
		}
		return fact;
	}
}
