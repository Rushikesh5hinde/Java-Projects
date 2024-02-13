package com.test;

public class Que1 {
	public static void printCount(int[] arr) {
		int evenct=0,oddct=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenct++;
			}else {
				oddct++;
			}
		}
		System.out.println("Even count:"+evenct);
		System.out.println("Odd Count:"+oddct);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		printCount(arr);
	}
}
