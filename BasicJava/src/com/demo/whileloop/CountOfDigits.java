package com.demo.whileloop;

import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,ct=0;
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num!=0) {
			ct++;
			num/=10;
		}
		System.out.println("Digit Count:"+ct);
	}
}
