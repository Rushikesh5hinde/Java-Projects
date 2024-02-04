package com.whileloop;

public class SumEven1_To_50 {
	public static void main(String[] args) {
		int i=1,evenSum=0;
		while(i<=50) {
			if(i%2==0) {
				evenSum+=i;
			}
			i++;
		}
		System.out.println("Even Sum: "+evenSum);
	}
}
