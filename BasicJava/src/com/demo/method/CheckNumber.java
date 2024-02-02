package com.demo.method;

import java.util.Scanner;

public class CheckNumber {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		checkNumber();
	}
	public static void checkNumber() {
		int num;
		char ch;
		int pCount=0,nCount=0,zCount=0;
		do {
			System.out.println("Enter number");
			num=sc.nextInt();
			if(num<0) {
				nCount++;
			}else if(num>0) {
				pCount++;
			}else {
				zCount++;
			}
			System.out.println("Do you want to continue?? Enter y or to stop enter ny character");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("Positive Count:"+pCount);
		System.out.println("Negative Count:"+nCount);
		System.out.println("Zero's:"+zCount);
	}
	
}
