package com.demo.home;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Prime Factors are:");
		primeFactors(num);
	}
	public static void primeFactors(int num) {
		int i;
		for(i=1;i<=num;i++) {
			if(num%i==0 && isPrime(i))
				System.out.println(i);
		}
	}
	public static boolean isPrime(int num) {
		if(num==1 || num==0) {
			return false;
		}else {
			int ct=0;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					ct++;
					break;
				}
			}
			return ct==0;
		}
	}
}
