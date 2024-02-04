package com.constructor;

import java.util.Scanner;

public class PalindromeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		Palindrome obj=new Palindrome(num);
		if(obj.isPalindrome())
			System.out.println(obj.num+" is Palindrome");
		else
			System.out.println(obj.num+" is not a Palindrome");
	}
}
