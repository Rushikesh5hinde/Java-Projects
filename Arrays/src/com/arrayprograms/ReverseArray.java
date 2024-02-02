package com.arrayprograms;

import java.util.Arrays;

public class ReverseArray {
	public static int[] reverseArray(int[] arr) {
		int j=arr.length-1;//4
		for(int i=0;i<arr.length;i++) {
			if(i<j) {//0<4
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j--;
		}
		return arr;
	}
	public static void reverseElements(int[] arr) {
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] res=reverseArray(arr);
		System.out.println("Reverse Array:"+Arrays.toString(res));
		
		int[] arr2= {11,12,13,14,15};
		reverseElements(arr2);
		
	}
}
