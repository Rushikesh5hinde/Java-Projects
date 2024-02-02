package com.demo.forloop;

import java.util.Scanner;

public class PrimeTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num;
		boolean flag=false;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num==0 || num==1) {
			flag=true;
		}else {
			for(i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag=true;
				}
			}
		}
		if(flag==true) {
			System.out.println(num+" is not prime!");
		}else {
			System.out.println(num+" is prime");
		}
	}
}
