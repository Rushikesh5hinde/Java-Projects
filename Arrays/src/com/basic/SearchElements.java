package com.basic;

public class SearchElements {
	public static boolean searchElements(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return true;
			}
		}
		return false;
	}
	public static void elementOccurance(int[] arr,int n) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("Position:"+i);
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Element not found!");
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {6,4,5,7,8,6,3,2,2,1};
		
		if(searchElements(arr, 3)) {
			System.out.println("Element found!");
		}else {
			System.out.println("Element not found!");
		}
		
		System.out.println("------------------------");
		int[] arr2= {1,2,3,3,4,2,6};
		
		elementOccurance(arr2, 2);
		System.out.println("--------------------------");
		elementOccurance(arr2, 11);
	}
}
