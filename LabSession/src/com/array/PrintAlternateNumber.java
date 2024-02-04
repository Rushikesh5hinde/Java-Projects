package com.array;

import java.util.Scanner;

public class PrintAlternateNumber {
	public static void printAlternate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
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
		printAlternate(arr);
	}
}
