package com.pattern;

public class StarPattern5 {
	public static void main(String[] args) {
		printPattern(5);
	}

	public static void printPattern(int rows) {
		int i,j,k;
		for(i=1;i<=rows;i++) {
			for(j=i;j<rows;j++) {
				System.out.print(" ");
			}
			for(k=1;k<2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
