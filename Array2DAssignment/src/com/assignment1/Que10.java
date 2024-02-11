package com.assignment1;
//10.WAP to find sum of main diagonal elements of a matrix.
public class Que10 {
	public static void printDiagonalSum(int[][] arr) {
		int sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					sum1=sum1+arr[i][j];
				}
				if((i+j)==2) {
					sum2+=arr[i][j];
				}
			}
			
		}
		System.out.println("First Diagonal Sum:"+sum1);
		System.out.println("Second Diagonal Sum:"+sum2);
	}
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		printDiagonalSum(arr);
	}
}
