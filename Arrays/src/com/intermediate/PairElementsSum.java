package com.intermediate;

public class PairElementsSum {
	public static void pairElements(int[] arr,int sum) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==sum) {
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {2,3,5,4,6,0,8};
		pairElements(arr,7);
	}
}
