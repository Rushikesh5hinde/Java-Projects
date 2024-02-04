package com.ifelseextra;

import java.util.Scanner;

public class PrintDaysMonth7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter month");
		num=sc.nextInt();
		if(num==1 || num==3 || num==5 || num==7 || num==8 || num==10 || num==12) {
			System.out.println("31 days");
		}else if(num==2) {
			System.out.println("28 or 29 days");
		}else if(num==4 || num==6 || num==9 || num==11) {
			System.out.println("30 days");
		}else {
			System.out.println("Invalid Input");
		}
	}
}
