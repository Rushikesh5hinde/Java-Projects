package com.demo.method;

import java.util.Scanner;

public class CheckFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Sum:"+calFactorial(num));
	}
	public static int calFactorial(int num) {
		int sum=0,i;
		for(i=1;i<=num;i++) {
			sum=sum+factorial(i);
		}
		return sum;
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
