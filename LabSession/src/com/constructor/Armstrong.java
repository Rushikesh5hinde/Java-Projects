package com.constructor;

import java.util.Scanner;

public class Armstrong {
	int num;
	public Armstrong() {
		
	}
	public Armstrong(int num) {
		this.num=num;
	}
	public int checkCount() {
		int temp=num;
		int ct=0;
		while(temp!=0) {
			ct++;
			temp/=10;
		}
		return ct;
	}
	public int checkPower(int base,int raise) {
		int pow=1;
		for(int i=0;i<raise;i++) {
			pow*=base;
		}
		return pow;
	}
	public boolean isArmstrong() {
		int original=num;
		int sum=0;
		int count=checkCount();
		while(num>0) {
			int rem=num%10;
			sum=sum+checkPower(rem, count);
			num/=10;
		}
		
		return original==sum;
		
	}
	
}
