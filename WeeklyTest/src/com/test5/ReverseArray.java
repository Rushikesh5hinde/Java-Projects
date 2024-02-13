package com.test5;

import java.util.Arrays;

public class ReverseArray {
	public static void reverseArray(int[] arr){
		int i,j=arr.length-1;
		for(i=0;i<arr.length;i++){
			if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args){
		int[] arr={3, 90, 45, 29, 37, 78};
		reverseArray(arr);
	}
}
