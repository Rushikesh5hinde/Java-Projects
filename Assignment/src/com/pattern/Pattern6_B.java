package com.pattern;

public class Pattern6_B {
	public static void printPattern(int rows) {
		int i,j,temp;
		for(i=1;i<=rows;i++) {
			temp=0;
			for(j=1;j<=i;j++) {
				System.out.print(temp++);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
