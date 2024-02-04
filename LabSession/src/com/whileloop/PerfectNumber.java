package com.whileloop;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number you want to check");
		num=sc.nextInt();
		if(isPerfect(num)) {
			System.out.println(num+" is Perfect!");
		}else {
			System.out.println(num+" is not Perfect!");
		}
		
	}
	public static boolean isPerfect(int num) {
		int i=1,sum=0;
		while(i<num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		return sum==num;
	}
}
