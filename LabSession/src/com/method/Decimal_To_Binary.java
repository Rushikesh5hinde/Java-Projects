package com.method;

import java.util.Scanner;

public class Decimal_To_Binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dec;
		System.out.println("Enter number");
		dec=sc.nextInt();
		System.out.println("Binary:"+decimalBinary(dec));
	}
	public static String decimalBinary(int num) {
		String s="";
		while(num!=0) {
			s=s+num%2;
//			System.out.println("s:"+s);
			num=num/2;
//			System.out.println("num:"+num);
		}
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		return str;
	}
}
