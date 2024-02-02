package com.demo.dowhile;

import java.util.Scanner;

public class Test_Do_While2 {
	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,sum;
		char ch;
		do {
			System.out.println("Enter n1:");
			n1=sc.nextInt();
			System.out.println("Enter n2:");
			n2=sc.nextInt();
			sum=add(n1, n2);
			System.out.println("Sum:"+sum);
			System.out.println("Do you want to continue?? if yes then enter y, "
					+ "if not then enter any char");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("---------END----------");
	}
}
