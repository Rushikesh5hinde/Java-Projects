package com.array;

import java.util.Arrays;

/*4. WAP to reverse the array itself, don’t print array in reverse – I want current array 
reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
37, 29, 45, 90, 3] by using temporary array. */
public class Que4 {
	static void printReverse(int[] arr) {
		int[] temp=new int[arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[index++]=arr[i];
		}
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		int[] arr= {3, 90, 45, 29, 37, 78};
		
		printReverse(arr);
	}
}
