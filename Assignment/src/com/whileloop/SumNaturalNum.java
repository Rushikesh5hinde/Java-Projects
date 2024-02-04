package com.whileloop;

public class SumNaturalNum {
	public static void main(String[] args) {
		int i=1,sum=0;
		while(i<=50) {
			sum+=i;
			i++;
		}
		System.out.println("Sum: "+sum);
	}
}
