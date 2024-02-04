package com.whileloop;

public class SumOdd1_To_50 {
	public static void main(String[] args) {
		int i=1,oddSum=0;
		while(i<=50) {
			if(i%2!=0) {
				oddSum+=i;
			}
			i++;
		}
		System.out.println("Even Sum: "+oddSum);
	}
}
