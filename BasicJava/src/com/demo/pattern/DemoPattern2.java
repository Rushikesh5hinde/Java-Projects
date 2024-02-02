package com.demo.pattern;

public class DemoPattern2 {
	public static void main(String[] args) {
		printPattern(5);
	}
	public static void printPattern(int rows) {
		int i,j,temp=1;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=rows;j++) {
				System.out.print(temp);
				if(temp==1)
					temp=0;
				else
					temp=1;
			}
			System.out.println();
		}
	}
}
