package com.pattern;

public class Pattern1_B {
	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=i;j<=rows;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(4);
	}
}
