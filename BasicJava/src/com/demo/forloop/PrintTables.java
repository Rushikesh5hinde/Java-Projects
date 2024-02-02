package com.demo.forloop;

import java.util.Scanner;

public class PrintTables {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("Enter number:");
		num=sc.nextInt();
		if(num>0) {
			System.out.println("Table of "+num);
			System.out.println("------------------");
			for(i=1;i<=10;i++) {
				
				System.out.println(num+" * "+i+" = "+(i*num));
			}
		}else {
			System.out.println("Invalid input");
		}
	}
}
