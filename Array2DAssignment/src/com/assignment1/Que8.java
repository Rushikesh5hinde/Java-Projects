package com.assignment1;

public class Que8 {
	
	public static void main(String[] args) {
		int[][] arr2= {{10,11},{12,13}};
		int[][] arr1= {{21,22},{23,24}};
		
		for(int i=0,j=0;i<arr1.length && j<arr2.length;i++,j++) {
			for(int m=0,n=0;m<arr1[i].length && n<arr2[j].length;m++,n++) {
				System.out.print((arr1[i][m]-arr2[j][n])+" ");
			}
			System.out.println();
		}
	}
}
