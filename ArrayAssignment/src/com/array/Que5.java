package com.array;
//3. WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
//output must be 78, 37, 29, 45, 90, 3 
import java.util.Arrays;

public class Que5 {
	public static int[] reverseArray(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
		return arr;
	}
	public static int[] printReverse(int[] arr) {
		int i;
		int j=arr.length-1;
		for(i=0;i<arr.length;i++) {
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			j--;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {3, 90, 45, 29, 37, 78};
		
//		int[] res=reverseArray(arr);
		
		int[] res=printReverse(arr);
		
		System.out.println(Arrays.toString(res));
	}
}
