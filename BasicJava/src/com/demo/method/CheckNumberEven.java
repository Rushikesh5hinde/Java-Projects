package com.demo.method;

import java.util.Scanner;

public class CheckNumberEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		checkNum(num);
	}
	public static void checkNum(int num) {
		if(num%2==0) {
			if(num%6==0)
				System.out.println(num+" is even and divisible by 6");
			else
				System.out.println(num+" is even and not divisible by 6");
		}else {
			if(num%5==0)
				System.out.println(num+" is odd and divisible by 5");
			else
				System.out.println(num+" is odd and not divisible by 5");
		}
	}
}
