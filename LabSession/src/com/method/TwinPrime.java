package com.method;

import java.util.Scanner;

public class TwinPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(checkTwinPrime(num)) {
			System.out.println(num+" is Twin Prime!");
		}else {
			System.out.println("not twin prime");
		}
	}
	public static boolean checkPrime(int num) {
		int i=2,ct=0;
		if(num==0 || num==1) {
			return false;
		}else {
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
	public static boolean checkTwinPrime(int num) {
		if(checkPrime(num)) {
			if(checkPrime(num+2)) {
				return true;
			}
		}
		return false;
	}
}
