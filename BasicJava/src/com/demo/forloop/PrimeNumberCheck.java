package com.demo.forloop;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num,ct=0;
		System.out.println("Enter number");
		num=sc.nextInt();
		for(i=2;i<=num/2;i++) {
			if(num%i==0) {
				ct++;
			}
		}
		if(ct==0) {
			System.out.println(num+" is Prime");
		}else {
			System.out.println(num+" is not Prime");
		}
	}
}
