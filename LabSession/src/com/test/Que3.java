package com.test;

import java.util.Arrays;

public class Que3 {
	public static void removeDuplicates(int[] arr) {
		int ct;
		boolean status;
		for(int i=0;i<arr.length;i++) {
			ct=1;
			status=false;
			for(int k=i-1;k>=0;k--) {
				if(arr[k]==arr[i]) {
					status=true;
					break;
				}
			}
			if(status==false) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						arr[j]=Integer.MIN_VALUE;
					}
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {4,3,2,4,9,2};
		removeDuplicates(arr);
	}
}
