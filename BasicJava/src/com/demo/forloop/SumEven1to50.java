package com.demo.forloop;

public class SumEven1to50 {
	public static void main(String[] args) {
		int i,evenSum=0;
		for(i=1;i<=50;i++) {
			if(i%2==0) {
				evenSum+=i;
			}
		}
		System.out.println("Total Sum:"+evenSum);
	}
}
