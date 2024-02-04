package com.constructor;

public class StrongNumber {
	int num;
	public StrongNumber() {
	
	}
	public StrongNumber(int num) {
		this.num = num;
	}
	public int checkFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	public boolean checkStrong() {
		int sum=0,temp=num;
		while(temp!=0) {
			int rem=temp%10;
			sum=sum+checkFactorial(rem);
			temp/=10;
		}
		return sum==num;
	}
	
}
