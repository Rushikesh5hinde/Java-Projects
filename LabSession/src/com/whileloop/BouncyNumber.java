package com.whileloop;

import java.util.Scanner;

public class BouncyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number you want to check");
		num=sc.nextInt();//5678
		boolean inc=false,dec=false;
		int rem1,rem2;
		while(num>10) {
			rem1=num%10;//8
//			System.out.println(rem1);
			num/=10;//567
			rem2=num%10;//7
//			System.out.println(rem2);
			if(rem1>rem2) {
				inc=true;
			}else if(rem1<rem2) {
				dec=true;
			}
//			System.out.println(num);
//			System.out.println(inc);
//			System.out.println(dec);	
		}
		if(inc==dec) {
			System.out.println("Bouncy");
		}else {
			System.out.println("Not Bouncy");
		}
		
	}
}
