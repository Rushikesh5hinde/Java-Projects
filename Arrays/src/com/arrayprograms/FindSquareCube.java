package com.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class FindSquareCube {
	public static int[] findSquare(int[] arr) {
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[i]*arr[i];
		}
		return res;
	}
	public static int[] findCube(int[] arr) {
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[i]*arr[i]*arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("1.square\n2.cube");
		System.out.println("Enter choice:");
		switch(sc.nextInt()) {
		case 1:
		{
			int[] res=findSquare(arr);
			System.out.println(Arrays.toString(res));
			break;
		}
		case 2:
			{
				int[] res=findCube(arr);
				System.out.println(Arrays.toString(res));
				break;
			}
		default:
			System.out.println("Invalid input!");
		}
	}
}
