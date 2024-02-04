package com.pattern;

public class Pattern1_A {
	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
