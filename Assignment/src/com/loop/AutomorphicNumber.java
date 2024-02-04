package com.loop;

public class AutomorphicNumber {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++) {
			if(checkAutomorphic(i))
				System.out.println(i);
		}
	}
	public static boolean checkAutomorphic(int num) {//25
		int ct=digitCount(num);//2
		int sq=num*num;//625
		int rem=sq%checkPower(10, ct);//625%100=25
		return rem==num;
	}
	public static int digitCount(int num) {
		int ct=0;
		while(num!=0) {
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int checkPower(int base,int raise) {
		int pow=1;
		for(int i=0;i<raise;i++) {
			pow*=base;
		}
		return pow;
	}
}
