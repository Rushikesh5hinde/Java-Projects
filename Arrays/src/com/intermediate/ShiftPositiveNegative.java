package com.intermediate;

import java.util.Arrays;

public class ShiftPositiveNegative {
	public static void shiftPositiveNegative(int[] arr) {
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			while(arr[left]>0 && left<right)
				left++;
			while(arr[right]<0 && left<right)
				right++;
			if(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right++;
			}
		}
	}
	public static void shiftPositive2(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//negative at end
//			for(int j=arr.length-1;j>=0;j--) {
//				if(arr[i]<0 && i<j) {
//					int temp=arr[j];
//					arr[j]=arr[i];
//					arr[i]=temp;
//				}
//			}
			//negative at beginning
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i]>0 && i<j) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {-5,1,2,-4,3,-6,7,8,-7};
		System.out.println(Arrays.toString(arr));
//		shiftPositiveNegative(arr);
//		System.out.println(Arrays.toString(arr));
		shiftPositive2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
