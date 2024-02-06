package com.arraytask0502;
//Find the pair of elements whose sum is equivalent to the given sum
public class ElementPair {
	public static void findElementsPair(int[] arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7,8,9};
		int sum=7;
		findElementsPair(arr, sum);
	}
}
