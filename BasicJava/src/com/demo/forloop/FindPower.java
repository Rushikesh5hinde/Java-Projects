package com.demo.forloop;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num,pow;
		long ans=1;
		System.out.println("Enter Number:");
		num=sc.nextInt();
		System.out.println("Enter Power:");
		pow=sc.nextInt();
		for(i=1;i<=pow;i++) {
			ans=ans*num;
		}
		System.out.println("Result: "+ans);
	}
}
