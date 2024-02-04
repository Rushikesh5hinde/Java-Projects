package com.loop;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(checkPalindrome(num)) {
			System.out.println(num+" is Palindrome");
		}else {
			System.out.println(num+" is not Palindrome");
		}
	}
	public static boolean checkPalindrome(int num) {
		int rev=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		return temp==rev;
	}
}
