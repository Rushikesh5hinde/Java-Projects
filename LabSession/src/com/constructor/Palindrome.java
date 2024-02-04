package com.constructor;

import java.util.Scanner;

public class Palindrome {
	int num;
	public Palindrome() {
		
	}
	public Palindrome(int num) {
		this.num = num;
	}
	public boolean isPalindrome() {
		int rev=0,temp=num;
		while(temp!=0) {
			rev=rev*10+(temp%10);
			temp/=10;
		}
		return rev==num;
	}
	
}
