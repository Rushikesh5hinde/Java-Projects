package com.arraytask0502;

import java.util.Arrays;

/* Merge the two arrays as follows
     ar1={1,2,3}
      ar2={4,5,6,7,8}
 o/p: mar1={1,4,2,5,3,6,7,8}
      mar2={1,5,3,7,8} */
public class MergeArray {
	public static int[] mergeArray(int[] a1,int[] a2) {
		int[] res=new int[a1.length+a2.length];
		int i,j,index=0;
		for(i=0,j=0;i<a1.length && j<a2.length;i++,j++) {
			res[index++]=a1[i];
			res[index++]=a2[j];
		}
		while(i<a1.length) {
			res[index++]=a1[i++];
		}
		while(j<a2.length) {
			res[index++]=a2[j++];
		}
		return res;
	}
	public static int[] mergeArraySkip(int[] a1,int[] a2) {
		int maxLength=Math.max(a1.length, a2.length);
		int[] res=new int[maxLength];
		int index=0,i=0;
		while(index<maxLength) {
			if(i<a1.length) {
				res[index++]=a1[i++];
			}
			if(i<a2.length) {
				res[index++]=a2[i++];
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6,7,8};
		
		System.out.println("Before Merge:");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("After Merge:");
		int[] res=mergeArray(arr1, arr2);
		System.out.println(Arrays.toString(res));
		
		System.out.println("----------------------");
		System.out.println("Before Merge:");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("After Merge:");
		int[] ans=mergeArraySkip(arr1, arr2);
		System.out.println(Arrays.toString(ans));
	}
}
