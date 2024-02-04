package com.arraytask0102;

import java.util.Arrays;

public class PrintEvenOddStart {
	public static void printEvenStart(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;i++) {
				if(arr[j]%2==0) {
					if(arr[i]%2==1) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		printEvenStart(arr);
	}
}
