package com.arraytask0102;

import java.util.Arrays;

//Shift zeros at the beginning of array
public class ShiftZerosStart {
	public static void shiftZeros(int[] arr) {
		int count=arr.length-1;//10
		for(int i=arr.length-1;i>=0;i--) {//10---0
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count--;
			}
		}
		while(count>=0) {
			arr[count--]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {5,6,0,-1,0,10,2,3,0,9};
		System.out.println(Arrays.toString(arr));
		shiftZeros(arr);
	}
}
