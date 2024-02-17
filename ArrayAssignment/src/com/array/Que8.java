package com.array;

import java.util.Arrays;

/*8. WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 
0, 2, 4] */
public class Que8 {
	static void rotateOnce(int[] arr) {
		int first=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=first;
	}
	public static void main(String[] args) {
		int[] arr= {2, 4, 9, 0};
		for(int i=0;i<2;i++) {
			rotateOnce(arr);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
