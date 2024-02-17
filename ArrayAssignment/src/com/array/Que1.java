package com.array;

public class Que1 {
	public static void secondMax(int[] arr) {
		int max=arr[0];
		int secondMax=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
				
			}else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
			
		}
		System.out.println("Max:"+max);
		System.out.println("SecondMax:"+secondMax);
	}
	public static void main(String[] args) {
		int[] arr= {20,0,31,45,100,1,105,90};
		secondMax(arr);
	}
}
