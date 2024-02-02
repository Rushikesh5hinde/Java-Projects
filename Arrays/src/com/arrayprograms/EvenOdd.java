package com.arrayprograms;

import java.util.Arrays;

public class EvenOdd {
	public static void evenOdd(int[] arr) {
		int[] evenArr=new int[arr.length];
		int[] oddArr=new int[arr.length];
		int index1=0,index2=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenArr[index1++]=arr[i];
			}else {
				oddArr[index2++]=arr[i];
			}
		}
		System.out.println("Even Array:"+Arrays.toString(evenArr));
		System.out.println("Odd Array:"+Arrays.toString(oddArr));
	}
	public static void main(String[] args) {
		int[] arr= {78,85,56,45,85,77,88,66};
		evenOdd(arr);
	}
}
