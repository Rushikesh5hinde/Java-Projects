package com.demo.method;

import java.util.Scanner;

public class SumNaturalNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range;
		System.out.println("Enter range");
		range=sc.nextInt();
		System.out.println("Sum:"+naturalSum(range));
	}
	public static int naturalSum(int range) {
		int i,sum=0;
		for(i=1;i<=range;i++) {
			sum+=i;
		}
		return sum;
	}
}
