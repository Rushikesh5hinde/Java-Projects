package com.demo.forloop;

import java.util.Scanner;

public class NumFactors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num,ct=0;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Factors are:");
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				ct++;
			}
		}
		System.out.println();
		System.out.println("Count of Factors: "+ct);
	}
}
