package com.demo.home;
//WAP print all armstrong from 1 to 5000
import java.util.Scanner;

public class RangeArmstrong {
	public static int checkPower(int base,int raise) {
		int i,power=1;
		for(i=0;i<raise;i++) {
			power*=base;
		}
		return power;
	}
	public static int digitCount(int num) {
		int ct=0;
		while(num!=0) {
			ct++;
			num/=10;
		}
		return ct;
	}
	public static boolean checkArmstrong(int num) {
		int ct=digitCount(num);
		int sum=0,temp=num;
		while(num!=0) {
			int rem=num%10;
			sum=sum+(checkPower(rem, ct));
			num/=10;
		}
		return temp==sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,range;
		System.out.println("Enter range");
		range=sc.nextInt();
		for(i=1;i<=range;i++) {
			if(checkArmstrong(i))
				System.out.println(i);
		}
	}
}
