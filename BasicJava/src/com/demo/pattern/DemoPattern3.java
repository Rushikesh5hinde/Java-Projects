package com.demo.pattern;

public class DemoPattern3 {
	public static void main(String[] args) {
		int rows=5;
		for(int i=rows;i>0;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(rows++);
			}
			System.out.println();
		}
	}
	
}
