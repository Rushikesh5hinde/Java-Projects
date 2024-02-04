package com.pattern;

public class Pattern5_B {
	public static void printPattern(int rows) {
		int i,j;
		char ch;
		for(i=1;i<=rows;i++) {
			ch='A';
			for(j=1;j<=i;j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
