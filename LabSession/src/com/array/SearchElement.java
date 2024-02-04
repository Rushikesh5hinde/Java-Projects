package com.array;

import java.util.Scanner;

public class SearchElement {
	public static boolean searchElement(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number you want to check:");
		int n=sc.nextInt();
		if(searchElement(arr, n))
			System.out.println("Element Found!");
		else
			System.out.println("Element not found!");
	}
}
