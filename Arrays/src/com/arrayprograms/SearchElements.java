package com.arrayprograms;

import java.util.Scanner;

public class SearchElements {
	public static boolean searchElements(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("element present at "+i+" index");
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {78,85,56,45,85,77,88,66};
		System.out.println("Enter number to search in array");
		int num=sc.nextInt();
		if(searchElements(arr, num)) {
			
		}else {
			System.out.println("Element not present");
		}
	}
}
