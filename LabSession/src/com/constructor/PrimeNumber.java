package com.constructor;

public class PrimeNumber {
	int num;
	public PrimeNumber()
	{
		
	}
	PrimeNumber(int num){
		this.num=num;
	}
	public boolean isPrime() {
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	public boolean checkPrime() {
		if(num==1 || num==0) {
			return false;
		}else {
			int ct=0,i;
			for(i=2;i<=num/2;i++) {
				if(num%i==0) {
					ct++;
					break;
				}
			}
			return ct==0;
		}
	}
}
