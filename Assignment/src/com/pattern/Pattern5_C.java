package com.pattern;

public class Pattern5_C {
	public static void printPattern(int rows) {
		int i,j;
		char ch='A';
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
