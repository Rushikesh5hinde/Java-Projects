package com.pattern;

public class Pattern2_B {
	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				if(j%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
