package com.demo.method;

import java.util.Scanner;

public class PrintTable {
	public static void showTable(int num) {
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		showTable(num);
	}
}
