package com.demo.method;

import java.util.Scanner;

public class DigitMultiply {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Result:"+digitMultiply(num));
	}
	public static int digitMultiply(int num) {
		int res=1;
		while(num!=0) {
			res=res*(num%10);
			num/=10;
		}
		return res;
	}
}
