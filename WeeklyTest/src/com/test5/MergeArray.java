package com.test5;

import java.util.Arrays;

public class MergeArray {
	public static void mergeArray(int[] arr1,int[] arr2){
		
		int big=arr1.length>arr2.length?arr1.length:arr2.length;
		int[] res=new int[big];
		int index=0;
		for(int i=0;i<big;){
			if(i<arr1.length){
				res[index]=arr1[i];
				index++;
				i++;
			}
			if(i<arr2.length){
				res[index]=arr2[i];
				index++;
				i++;
			}
		}
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args){

		int[] arr1={1,2,3,4,5,20,30};
		int[] arr2={6,7,8,9,10};
		
		mergeArray(arr1,arr2);
	}
}
