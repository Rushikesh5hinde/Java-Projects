package com.intermediate;

import java.util.Arrays;

public class LeftRotate {
	public static void rotateOnce(int[] arr) {
		int first=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------");
		for(int i=0;i<3;i++) {
			rotateOnce(arr);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("-----------------------");
		System.out.println(Arrays.toString(arr));
	}
}
