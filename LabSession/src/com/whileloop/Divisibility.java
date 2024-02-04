package com.whileloop;

public class Divisibility {
	public static void checkDivisible(int range) {
		int i;
		for(i=1;i<=20;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		checkDivisible(20);
	}
}
