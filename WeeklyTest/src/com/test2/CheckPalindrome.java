package com.test2;

import java.util.Scanner;

public class CheckPalindrome {
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
	public static boolean checkPalindrome(int num){
		int rev=0,temp=num;
		while(num!=0){
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
		}
		return temp==rev;
	}
}
