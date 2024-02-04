package com.array;

import java.util.Scanner;

public class SumOddNumber {
	public static int printSumOdd(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1)
			{
				sum+=arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum:"+printSumOdd(arr));
	}
}
