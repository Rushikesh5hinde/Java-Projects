package com.pattern;

public class Pattern7_A {
	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {//1 2 3 4 5
			for(j=i;j>=1;j--) {//1<=1 1<=2
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
