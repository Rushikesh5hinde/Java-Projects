package com.loop;

import java.util.Scanner;

public class DigitProductQue9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println(digitProduct(num));
		
	}
	public static int digitProduct(int num) {
		int res=1;
		while(num!=0) {
			res=res*(num%10);
			num/=10;
		}
		return res;
	}
}
