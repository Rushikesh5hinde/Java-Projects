package com.array;

import java.util.Scanner;

public class AverageRainfall {
	public static double printAvgRainfall(int[] arr) {
		int size=arr.length,sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return (sum/size);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Average Rainfall:"+printAvgRainfall(arr));
	}
}
