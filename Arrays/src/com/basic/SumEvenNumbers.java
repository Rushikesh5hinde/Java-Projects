package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
	public int evenSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				sum+=arr[i];
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
		
		SumEvenNumbers s1=new SumEvenNumbers();
		System.out.println(Arrays.toString(arr));
		System.out.println("Even Sum:"+s1.evenSum(arr));
		
		System.out.println("-----------------------------------");
		int[] arr1= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr1));
		System.out.println("Even Sum:"+s1.evenSum(arr1));
		System.out.println("---------------------------------------");
		//anonymous array
		System.out.println("Anonymous:");
		System.out.println("Even Sum:"+s1.evenSum(new int[] {10,20,30}));
	}
}
