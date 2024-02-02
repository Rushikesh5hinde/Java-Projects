package com.demo.forloop;

import java.util.Scanner;

public class PrintLoopNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num;
		System.out.println("Enter number");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			System.out.println(i);
		}
	}
}
