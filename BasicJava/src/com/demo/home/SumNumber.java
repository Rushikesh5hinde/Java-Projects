package com.demo.home;

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice,range;
		char ch;
		do {
			System.out.println("1.sum of n natural numbers \n2.sum of n even numbers \n3.sum of n odd numbersS");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			System.out.println("Enter range");
			range=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Sum of Natural numbers:"+naturalSum(range));
				break;
			case 2:
				System.out.println("Sum of Even Numbers:"+evenSum(range));
				break;
			case 3:
				System.out.println("Sum of Odd Numbers:"+oddSum(range));
				break;
				default:
					System.out.println("Invalid input");
			}
			System.out.println("do you want to continue? if yes then press y or to exit press n");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	public static int oddSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static int evenSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static int naturalSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
}
