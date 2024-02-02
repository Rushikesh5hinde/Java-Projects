package com.arrayprograms;
// WAP to insert an element in a specific position into an array.
import java.util.Arrays;

public class InsertElement {
	public static void insertElement(int n,int index,int[] arr) {
		int res[]=new int[arr.length+1];
		int ind=0;
		if(index<0) {
			System.out.println("Invalid index");
		}else {
			for(int i=0;i<arr.length;i++) {
//				if(index<i) {
//					res[ind++]=arr[i];
//				}else if(index==i) {
//					res[ind++]=n;
//					res[ind++]=arr[i];
//				}else {
//					res[ind++]=arr[i];
//				}
				
				if(index!=i) {
				res[ind++]=arr[i];
				}else {
					if(index==i) {
						res[ind++]=n;
						res[ind++]=arr[i];
					}
				}
			}
			System.out.println(Arrays.toString(res));
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		insertElement(25, 0, arr);
	}
}
