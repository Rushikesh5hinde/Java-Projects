package com.intermediate;

import java.util.Arrays;

public class ArraySwap {
	public static void swapArray(int[] arr) {
		
		for(int i=1;i<arr.length/2;i++) {
			for(int j=i+1;j<arr.length/2;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=(arr.length/2)+1;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {4,5,6,7,1,2,4,6,5,9,0};
		swapArray(arr);
	}
}
