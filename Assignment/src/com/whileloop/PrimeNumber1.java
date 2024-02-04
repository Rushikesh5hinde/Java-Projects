package com.whileloop;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=2,num,ct=0;
		System.out.println("Enter number to check");
		num=sc.nextInt();
		if(num==1 || num==0) {
			System.out.println(num+" is not prime");
		}else {
			while(i<=num/2) {
				if(num%i==0) {
					ct++;
					break;
				}
				i++;
			}
			if(ct==0) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
		}
	}
}
