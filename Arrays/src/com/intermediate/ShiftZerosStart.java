package com.intermediate;

import java.util.Arrays;

public class ShiftZerosStart {
	public static void shiftZeros(int[] arr) {
		int count=arr.length-1;//10
		for(int i=arr.length-1;i>=0;i--) {//10-0
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count--;
			}
		}
		while(count>=0) {
			arr[count--]=0;
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,6,0,-7,5,0,4,0,5,6,2};
		System.out.println(Arrays.toString(arr));
		shiftZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
}
