package com.pattern;

public class Pattern4_A {
	public static void printPattern(int rows) {
		int i,j,temp;
		for(i=1;i<=rows;i++) {
			temp=1;
			for(j=i;j<=rows;j++) {
				System.out.print(temp++);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
