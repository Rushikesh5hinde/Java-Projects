package com.test1;

import java.util.Scanner;

public class DivisibleBy7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,rem;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num%7==0) {
			System.out.println(num+" is divisible by 7");
		}else {
			rem=num%7;
			System.out.println("You need to add: "+(7-rem)+" for complete divisibility");
		}
	}
}
