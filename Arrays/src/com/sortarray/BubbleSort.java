package com.sortarray;

import java.util.Arrays;

public class BubbleSort {
	public static void sortArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {2,3,1,7,5,6,0,4};
		System.out.println("Before:");
		System.out.println(Arrays.toString(arr));
		System.out.println("After:");
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
