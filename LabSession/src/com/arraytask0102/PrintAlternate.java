package com.arraytask0102;

import java.util.Arrays;

public class PrintAlternate {
	public static void printAlternate(int[] arr1,int[] arr2) {
		int[] res=new int[arr1.length+arr2.length];
		int index=0;
		int big=arr1.length>arr2.length?arr1.length:arr2.length;
		for(int i=0;i<big;i++) {
			if(i<arr1.length) {
				res[index++]=arr1[i];
			}
			if(i<arr2.length) {
				res[index++]=arr2[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {11,22,33};
		printAlternate(arr1, arr2);
		
	}
}
