package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCubeArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		printCubes(arr);
	}

	public static void printCubes(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
}
