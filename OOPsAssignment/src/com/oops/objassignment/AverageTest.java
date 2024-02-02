package com.oops.objassignment;

import java.util.Scanner;

public class AverageTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter first no");
		n1=sc.nextInt();
		System.out.println("Enter second no");
		n2=sc.nextInt();
		System.out.println("Enter third no");
		n3=sc.nextInt();
		
		Average a1=new Average();
		a1.setValues(n1, n2, n3);
		System.out.println("Average:"+a1.printAverage());
	}
}
