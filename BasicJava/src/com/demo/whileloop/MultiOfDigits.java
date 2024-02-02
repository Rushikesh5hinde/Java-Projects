package com.demo.whileloop;

import java.util.Scanner;

public class MultiOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,ans=1;
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num!=0) {
			ans*=(num%10);
			num/=10;
		}
		System.out.println("Multipliction:"+ans);
	}
}
