package com.pattern;

public class Pattern7_B {
	public static void printPattern(int rows) {
		int i,j;
		for(i=rows;i>=1;i--){	//5
			for(j=i;j<=rows;j++) {//i=5 j>=5 i=4 j=5 j=4
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
