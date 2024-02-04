package com.pattern;

public class Pattern4_C {
	public static void printPattern(int rows) {
		int i,j,temp;
		for(i=1;i<=rows;i++) {
			temp=5;
			for(j=1;j<=i;j++) {
				System.out.print(temp--);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
