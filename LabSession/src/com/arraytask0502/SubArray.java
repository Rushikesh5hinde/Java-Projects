package com.arraytask0502;

import java.util.Arrays;

/*Find a continuous sub array whose sum is equal to given number. 
   e.g. if given array is { 12 ,4, 2, 10 , 5 , 1 }  
   and given number is 16 then sum of sub array { 4,2,10} and {10, 5,1},{12,4} is
    equal to given number.*/

public class SubArray {
	public static void printSubArray(int[] arr,int sum) {
		
		for(int i=0;i<arr.length;i++) {
			int[] temp=new int[arr.length];
			int index=0;
			temp[index]=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				
				if((temp[index]+arr[j])<=sum) {
					if((temp[index]+arr[j])==sum) {
						index++;
						temp[index]=arr[j];
						System.out.println(Arrays.toString(temp));
					}else {
						index++;
						temp[index]=arr[j];
					}
					
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {10,4,2,10,5,1};
		int sum=16;
		printSubArray(arr, sum);
	}
}
