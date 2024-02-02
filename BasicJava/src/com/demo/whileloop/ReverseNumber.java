package com.demo.whileloop;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,rem;
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num!=0) {
			rem=num%10;
			num/=10;
			System.out.println(rem);
		}
	}
}
