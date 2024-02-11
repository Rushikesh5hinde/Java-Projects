package com.assignment1;

public class Que3 {
	public static void main(String[] args) {
		int[][] arr= {{22, 31, 9}, {12, 25, 16}} ;
		
		int max;
		for(int i=0;i<arr.length;i++) {
			max=Integer.MIN_VALUE;
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
