package com.demo.pattern;

public class ReversePattern {
	public static void printPattern(int rows) {
		int i,j,k;
		for(i=1;i<=rows;i++) {
			for(k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(j=rows;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
