package com.test4;

import java.util.Arrays;

class Demo{
	public static void findCommon(int[] arr1,int[] arr2){
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}
	public static void main(String[] args){
		int[] arr1={1,2,3,4,5};
		int[] arr2={4,5,6,7,8};
		findCommon(arr1,arr2);
	}
}
