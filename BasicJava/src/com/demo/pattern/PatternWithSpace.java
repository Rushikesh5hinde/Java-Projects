package com.demo.pattern;

public class PatternWithSpace {
	public static void main(String[] args) {
		printPattern(5);
	}
	public static void printPattern(int rows) {
		int i,j,k;
		for(i=1;i<=rows;i++) {
			for(k=rows-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
