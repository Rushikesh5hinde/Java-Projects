package com.pattern;

public class StarPattern4 {
	public static void main(String[] args) {
		printPattern(5);
	}

	public static void printPattern(int rows) {
		int i,j,k;
		for(i=1;i<=rows;i++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(k=i;k<=rows;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
