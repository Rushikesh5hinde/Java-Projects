package com.arraytask0102;

import java.util.Arrays;

//Find the second minimum number in an array without sorting
public class SecondMinNumber {
	public static int findSecondMin(int[] arr) {
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
//				secondMin=min;
				min=arr[i];
			} 
			else if(arr[i]<secondMin && secondMin!=min) {
				secondMin=arr[i];
			}
		}
		return secondMin;
	}
	public static void main(String[] args) {
		int[] arr= {1,6,3,4,2,5};
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Min:"+findSecondMin(arr));
	}
}
