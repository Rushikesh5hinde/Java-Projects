package com.pattern;

public class Pattern1_C {
	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=rows;j++) {
				System.out.print("@"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(4);
	}
}
