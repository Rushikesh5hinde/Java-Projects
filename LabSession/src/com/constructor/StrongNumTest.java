package com.constructor;

import java.util.Scanner;

public class StrongNumTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		StrongNumber obj=new StrongNumber(num);
		if(obj.checkStrong())
			System.out.println(obj.num+" is Strong");
		else
			System.out.println(obj.num+" is not a Strong number");
	}
}
