package com.assignment1;

import java.util.Scanner;

public class Que7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		System.out.println("Enter columns");
		int cols=sc.nextInt();
		int[][] arr=new int[rows][cols];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter values in row:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arr1=transposeArray(arr, rows, cols);
		
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] transposeArray(int[][] arr, int rows, int cols) {
		int[][] temp=new int[cols][rows];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j]=arr[j][i];
			}
		}
		return temp;
	}
}
