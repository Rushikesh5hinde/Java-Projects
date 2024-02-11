package com.assignment1;
//9.WAP to find sum of each row and column of a matrix.
public class Que9 {
	public static void printSumRow(int[][] arr) {
		int rowsum;
		for(int i=0;i<arr.length;i++) {
			rowsum=0;
			for(int j=0;j<arr[i].length;j++) {
				rowsum=rowsum+arr[i][j];
			}
			System.out.println("Row:"+(i+1)+" Sum:"+rowsum);
		}
	}
	public static void printSumColumn(int[][] arr) {
		int colsum;
		for(int i=0;i<arr.length;i++) {
			colsum=0;
			for(int j=0,k=i;j<arr.length && k<arr.length;j++) {
				colsum+=arr[j][k];
			}
			System.out.println("Row:"+(i+1)+" Sum:"+colsum);
		}
	}
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		printSumRow(arr);
		System.out.println("---------------");
		printSumColumn(arr);
	}
}
