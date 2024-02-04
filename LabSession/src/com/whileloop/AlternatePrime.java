package com.whileloop;

public class AlternatePrime {
	public static void main(String[] args) {
		alternatePrime(6);
	}
	public static boolean isPrime(int num) {
		if(num==1 || num==0) {
			return false;
		}else {
			int i,ct=0;
			for(i=2;i<=num/2;i++) {
				if(num%i==0) {
					ct++;
					break;
				}
			}
			return ct==0;
		}
	}
	public static void alternatePrime(int range) {
		int i=1,ct=0;
		boolean flag=true;
		while(ct<range) {
			if(isPrime(i)) {
				if(flag) {
					System.out.println(i);
					ct++;
					flag=false;
				}else {
					flag=true;	
				}
			}
			i++;
		}
	}
}
