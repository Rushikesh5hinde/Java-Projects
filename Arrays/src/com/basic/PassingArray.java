package com.basic;

import java.util.Arrays;

public class PassingArray {
	
	public void squareElements(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	public int sumElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr= {4,5,6,7};
		
		PassingArray p1=new PassingArray();
		
		System.out.println("Sum:"+p1.sumElements(arr));
		
		p1.squareElements(arr);
		
		//anonymous array
		System.out.println("Sum:"+p1.sumElements(new int[] {1,2,3}));
		
		p1.squareElements(new int[] {7,8,9});
	}
}
