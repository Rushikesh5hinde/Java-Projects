package com.loop;

import java.util.Scanner;

public class DisarumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(checkDisarum(num))
			System.out.println(num+" is Disarum!");
		else
			System.out.println(num+" is not Disarum!");
	}
	public static boolean checkDisarum(int num) {
		int sum=0,temp=num;
		int ct=digitCount(num);
		while(num!=0) {
			int rem=num%10;
			sum=sum+calPower(rem, ct--);
			num/=10;
		}
		return temp==sum;
		
	}
	public static int digitCount(int num) {
		int ct=0;
		while(num!=0) {
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int calPower(int base,int raise) {
		int i,pow=1;
		for(i=0;i<raise;i++) {
			pow*=base;
		}
		return pow;
	}
}
