package com.whileloop;

import java.util.Scanner;

public class Fibonacci {
	public static void checkFibonacci(int num) {
		int n1,n2,n3,i;
		n1=0;n2=1;
		System.out.println(n1);
		for(i=1;i<=num;i++) {
			System.out.println(n2);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		checkFibonacci(num);
	}
}
