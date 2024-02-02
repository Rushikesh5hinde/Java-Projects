package com.basic;

import java.util.Scanner;

public class ElementsSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size");
		int arr[]=new int[sc.nextInt()];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum:"+sum);
	}
}
