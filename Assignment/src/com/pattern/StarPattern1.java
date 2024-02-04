package com.pattern;

public class StarPattern1 {
	public static void main(String[] args) {
		printPattern(5);
	}
	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
