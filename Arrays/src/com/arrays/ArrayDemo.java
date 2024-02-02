package com.arrays;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size");
//		int size=sc.nextInt();
//		int[] arr=new int[size];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//					
//		}
		
		int[] arr=new int[5];
		int temp=5;
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp;
			temp--;
					
		}
//		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
					
		}
	}
}
