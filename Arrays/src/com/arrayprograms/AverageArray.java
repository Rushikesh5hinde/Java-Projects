package com.arrayprograms;

public class AverageArray {
	public static int average(int[] arr) {
		int sum=0,avg;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=(sum/arr.length);
		return avg;
	}
	public static double average(double[] arr) {
		double sum=0,avg;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=(sum/arr.length);
		return avg;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println("Average:"+average(arr));
		
		double arr2[]= {1.1,1.2,1.3};
		System.out.println("Average:"+average(arr2));
	}
}
