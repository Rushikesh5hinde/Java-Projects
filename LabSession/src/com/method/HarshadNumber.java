package com.method;

import java.util.Scanner;

public class HarshadNumber {
	public static boolean isHarshadNumber(int num) {
		int sum=0;
		int temp=num;
		while(num!=0) {
			sum=sum+(num%10);
			num/=10;
		}
		return temp%sum==0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(isHarshadNumber(num)) {
			System.out.println(num+" is Harshad Number");
		}else {
			System.out.println(num+" is not a Harshad Number");
		}
	}
}
