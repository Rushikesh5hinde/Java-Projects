package com.merge;

import java.util.Arrays;

public class MergeArrays {
	public static int[] mergeArrays(int[] arr1,int[] arr2) {
		int[] res=new int[arr1.length+arr2.length];
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			res[index++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			res[index++]=arr2[i];
		}
		return res;
	}
	public static int[] mergeAlternate(int[] arr1,int[] arr2) {
		int[] res=new int[arr1.length+arr2.length];
		int i,j,index;
		index=0;
		for(i=0,j=0;i<arr1.length && j<arr2.length;i++,j++) {
			res[index++]=arr1[i];
			res[index++]=arr2[j];
		}
		while(i<arr1.length) {
			res[index++]=arr1[i++];
		}
		while(j<arr2.length) {
			res[index++]=arr2[j++];
		}
		return res;
	}
	public static int[] mergeAlternateSkip(int[] arr1,int[] arr2) {
		int maxLength=Math.max(arr1.length, arr2.length);
		int[] res=new int[maxLength];
		int i=0,index=0;
		
		while(index<maxLength) {
			if(i<arr1.length) {
				res[index++]=arr1[i++];
			}
			if(i<arr2.length) {
				res[index++]=arr2[i++];
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {11,22,33,44};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[] res=mergeArrays(arr1, arr2);
		System.out.println("After Merge:");
		System.out.println(Arrays.toString(res));
		System.out.println("--------------------------");
		int[] ans=mergeAlternate(arr1, arr2);
		System.out.println("After merge:");
		System.out.println(Arrays.toString(ans));
		System.out.println("--------------------------");
		int[] ans2=mergeAlternateSkip(arr1, arr2);
		System.out.println("After merge:");
		System.out.println(Arrays.toString(ans2));
	}
}
