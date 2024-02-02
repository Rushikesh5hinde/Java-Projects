package com.basic;

import java.util.Scanner;

public class PrintEvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Even Numbers:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
	}
}
