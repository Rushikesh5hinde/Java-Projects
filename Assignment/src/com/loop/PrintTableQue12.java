package com.loop;

import java.util.Scanner;

public class PrintTableQue12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		printTable(num);
	}
	public static void printTable(int num) {
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(num*i);
		}
	}
}
