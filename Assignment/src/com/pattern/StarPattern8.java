package com.pattern;

public class StarPattern8 {
	public static void main(String[] args) {
		printPattern(5);
	}

	public static void printPattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=rows*2;j++) {
				if(i==j || i+j==11) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}		
			}
			System.out.println();
		}
		
	}
}
