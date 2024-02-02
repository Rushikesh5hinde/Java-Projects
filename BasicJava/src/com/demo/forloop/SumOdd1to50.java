package com.demo.forloop;

public class SumOdd1to50 {
	public static void main(String[] args) {
		int i,oddSum=0;
		for(i=1;i<=50;i++) {
			if(i%2!=0) {
				oddSum+=i;
			}
		}
		System.out.println("Total Sum:"+oddSum);
	}
}
