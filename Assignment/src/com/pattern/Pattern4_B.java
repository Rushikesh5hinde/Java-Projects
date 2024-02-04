package com.pattern;

public class Pattern4_B {
	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=rows;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
