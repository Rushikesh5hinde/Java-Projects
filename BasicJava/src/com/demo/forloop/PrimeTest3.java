package com.demo.forloop;

import java.util.Scanner;

public class PrimeTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num,ct=0;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num==0 || num==1) {
			System.out.println(num+" is not prime");
		}else {
			for(i=2;i<=num/2;i++) {
				if(num%2==0) {
					ct++;
					break;
				}
			}
			if(ct==0) {
				System.out.println(num+" is prime");
			}else {
				System.out.println(num+" is not prime");
			}
		}
		
	}
}
