package com.ifelse;

import java.util.Scanner;

public class PrintSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		for(;sum<50;) {
			System.out.println("Enter number");
			num=sc.nextInt();
			if(num<0) {
				continue;
			}else if(num>0) {
				sum=sum+num;
				System.out.println("Sum:"+sum);
			}
		}
		System.out.println("You have reached to Sum");
	}
}
