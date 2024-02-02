package com.basic;

import java.util.Arrays;

public class ReplaceNegative {
	public static void replaceNegative(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {1,2,-1,-2,4,-6};
		
		replaceNegative(arr);
	}
}
