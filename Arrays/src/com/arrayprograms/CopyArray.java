package com.arrayprograms;

import java.util.Arrays;

public class CopyArray {
	public static int[] copyArray(int[] arr) {
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] res=copyArray(arr);
		System.out.println("Result:"+Arrays.toString(res));
	}
}
