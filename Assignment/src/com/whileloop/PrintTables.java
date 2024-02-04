package com.whileloop;

import java.util.Scanner;

public class PrintTables {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1,num;
		System.out.println("Enter number");
		num=sc.nextInt();
		while(i<=10) {
			System.out.println(num+" * "+i+" = "+(i*num));
			i++;
		}
	}
}
