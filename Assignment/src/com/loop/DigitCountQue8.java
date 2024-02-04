package com.loop;

import java.util.Scanner;

public class DigitCountQue8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println(count(num));
	}
	public static int count(int num) {
		int ct=0;
		while(num!=0) {
			ct++;
			num/=10;
		}
		return ct;
	}
}
