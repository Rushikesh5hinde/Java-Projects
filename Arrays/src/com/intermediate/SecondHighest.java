package com.intermediate;

import java.util.Arrays;

public class SecondHighest {
	public static int findSecondHighest(int[] arr) {
		int high=Integer.MIN_VALUE;
		int secondHigh=Integer.MIN_VALUE;
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>high) {
//				secondHigh=high;
//				high=arr[i];
//			}else if(arr[i]>secondHigh) {
//				secondHigh=arr[i];
//			}
//		}
		
		for(int x:arr) {
			if(x>high) {
				secondHigh=high;
				high=x;
			}else if(x>secondHigh) {
				secondHigh=x;
			}
		}
		return secondHigh;
	}
	public static void main(String[] args) {
		int[] arr= {1,3,2,5,6,4};
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Highest:"+findSecondHighest(arr));
	}
}
