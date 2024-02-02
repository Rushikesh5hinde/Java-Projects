package com.demo.home;
//WAP print all Palindrome from 1 to 500
import java.util.Scanner;

public class RangePalindrome {
	public static boolean checkPalindrome(int num) {
		int rev=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return temp==rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range,i;
		System.out.println("Enter range");
		range=sc.nextInt();
		for(i=1;i<=range;i++) {
			if(checkPalindrome(i))
				System.out.println(i);
		}
	}
}
