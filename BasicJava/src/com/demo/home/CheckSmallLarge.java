package com.demo.home;

import java.util.Scanner;

public class CheckSmallLarge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		char ch;
		do {
			System.out.println("Enter num");
			num=sc.nextInt();
			if(num<min) {
				min=num;
			}
			if(num>max) {
				max=num;
			}
			System.out.println("Continue:y Stop:n");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
	}
}
