package com.array;

import java.util.Scanner;

public class PrintPrimeNumber {
	public static boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}else {
			int ct=0;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					ct++;
					break;
				}
			}
			return ct==0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(checkPrime(arr[i]))
				System.out.print(arr[i]+" ");
		}
	}
}
