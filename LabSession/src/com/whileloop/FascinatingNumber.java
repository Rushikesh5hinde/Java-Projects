package com.whileloop;

import java.util.Scanner;

public class FascinatingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;//192
		System.out.println("Enter number:");
		num=sc.nextInt();
		if(checkFascinating(num))
			System.out.println(num+" is Fascinating Number");
		else
			System.out.println(num+" is not Fascinating!");
	}
	public static boolean checkFascinating(int num) {
		int count=digitCount(num);
		if(count>=3) {
			int n1,n2;
			n1=num*2;
			n2=num*3;
			String res=num+""+n1+n2;
			long n=Long.parseLong(res);	
			for(int i=1;i<=9;i++) {
				int ct=numFrequency((int) n, i);
				if(ct!=1) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	public static int digitCount(int num) {
		int ct=0;
		while(num!=0) {
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int numFrequency(int num,int n) {
		int ct=0;
		while(num!=0) {
			int rem=num%10;
			if(rem==n) {
				ct++;
			}
			num/=10;
		}
		return ct;
	}
}
