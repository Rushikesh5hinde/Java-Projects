package com.method;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(checkPrime(num)) {
			System.out.println(num+" is Prime");
		}else {
			System.out.println(num+" is not Prime");
		}
	}
	public static boolean checkPrime(int num) {
		int i=2,ct=0;
		while(i<num) {
			if(num%i==0) {
				ct++;
				break;
			}
			i++;
		}
		return ct==0;
	}
}
