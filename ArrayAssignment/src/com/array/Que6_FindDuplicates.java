package com.array;
/*6. Write a Java program to find the duplicate values of an array of integer values. 
Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78. */
public class Que6_FindDuplicates {
	static void findDuplicates(int[] arr) {
		int ct;
		boolean status;
		for(int i=0;i<arr.length;i++) {
			ct=1;
			status=false;
			for(int k=i-1;k>=0;k--) {
				if(arr[i]==arr[k]) {
					status=true;
					break;
				}
			}
			if(status==false) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						ct++;
					}
				}
				if(ct>1) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {3, 10, 90, 78, 56, 10, 78, 34, 61};
		findDuplicates(arr);
	}
}
