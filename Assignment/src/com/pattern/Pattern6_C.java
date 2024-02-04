package com.pattern;

public class Pattern6_C {
	public static void printPattern(int rows) {
		int i,j;
		for(i=rows;i>=1;i--) {//5 4 3 2 1
			for(j=rows;j>=i;j--) {//5>=5 5>=4
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
