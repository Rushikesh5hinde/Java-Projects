package com.demo.method;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(int num) {
		int temp=num,rev=0;
		while(num!=0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		return temp==rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(checkPalindrome(num))
			System.out.println(num+" is Palindrome!");
		else
			System.out.println(num+" is not Palindrome!");
	}
}
