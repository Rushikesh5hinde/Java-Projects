package com.arraytask0102;

import java.util.Arrays;

// WAP to left rotate the array
//arr={1,2,3,4,5}
//o/p: {3,4,5,1,2}
public class LeftRotate {
	public static void leftRotate(int[] arr) {
		int last=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=last;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println("After rotate:");
		for(int i=0;i<2;i++) {
			leftRotate(arr);
		}
		System.out.println(Arrays.toString(arr));
	}
}
