package com.pattern;

public class Pattern5_A {
	public static void printPattern(int rows) {
		int i,j;
		for(i=rows;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
