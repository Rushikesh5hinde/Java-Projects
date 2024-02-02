package com.demo.dowhile;

public class Test_Do_While {
	public static void printNum() {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	public static void displayNum(int n) {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
	}
	public static void main(String[] args) {
//		printNum();
		displayNum(50);
	}
}
