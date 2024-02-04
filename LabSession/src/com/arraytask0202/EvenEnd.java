package com.arraytask0202;

import java.util.Arrays;

//Shift all the even number at the end of array w/o using temporary array
public class EvenEnd {
	public static void shiftEven(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i]%2==0 && i<j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		shiftEven(arr);
	}
}
