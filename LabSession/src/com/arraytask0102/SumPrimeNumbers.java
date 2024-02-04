package com.arraytask0102;

import java.util.Arrays;

//Find the sum of prime numbers in array using enhanced for loop
public class SumPrimeNumbers {
	public static int sumPrime(int[] arr) {
		int sum=0;
		for(int x:arr) {
			if(checkPrime(x))
				sum+=x;
		}
		return sum;
	}
	public static boolean checkPrime(int num) {
		if(num<=1)
			return false;
		else {
			boolean flag=true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			return flag;
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,6,7,8,9,10,11,12,13};
		System.out.println(Arrays.toString(arr));
		System.out.println("Prime Sum :"+sumPrime(arr));
	}
}
