package com.pattern;

public class Pattern7_C {
	public static void printPattern(int rows) {
		int i,j;
		for(i=rows;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(i=2;i>=1;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
