package com.loop;

public class PrimeNumQue11 {
	public static void main(String[] args) {
		int start,end=300;
		for(start=400;start>=end;start--) {
			if(isPrime(start)) {
				System.out.println(start);
			}
		}
	}
	public static boolean isPrime(int num) {
		int i=2,ct=0;
		while(i<num) {
			if(num%i==0) {
				ct++;
				break;
			}
			i++;
		}
		return ct==0;
	}
}
