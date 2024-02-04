package com.method;

public class KeithNumber {
	public static void main(String[] args) {
		keithNumber(23);
	}
	public static int digitCount(int num) {
		int ct=0;
		while(num!=0) {
			ct++;
			num/=10;
		}
		return ct;
	}
	public static void keithNumber(int num) {
		int n1,n2,sum=0,temp=num;
		n1=num%10;
		sum=sum+n1;
		num/=10;
		n2=num%10;
		sum=sum+n2;
		System.out.println(sum);
		System.out.println(n1);
		while(sum<temp) {
			n2=sum;
			sum=n1+n2;
		}
		System.out.println(sum);
	}
}
