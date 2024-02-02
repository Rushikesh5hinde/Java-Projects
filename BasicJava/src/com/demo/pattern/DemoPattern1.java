package com.demo.pattern;

import java.util.Scanner;

public class DemoPattern1 {
	public static void pattern1(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}//inner loop ends
			System.out.println();
		}//outer loop ends
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows;
		System.out.println("Enter rows:");
		rows=sc.nextInt();
		pattern1(rows);
	}
}
