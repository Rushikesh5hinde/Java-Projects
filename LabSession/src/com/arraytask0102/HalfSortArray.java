package com.arraytask0102;

import java.util.Arrays;

//WAP to half sort the array in ascending and half in descending
public class HalfSortArray {
	public static void halfSort(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			for(int j=i+1;j<arr.length/2;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=arr.length/2;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
//		int[] arr= {3,4,2,1,5,6,7,8};
		int[] arr= {9,4,2,6,1,5,8,3};
		System.out.println(Arrays.toString(arr));
		halfSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
